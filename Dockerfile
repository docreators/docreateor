FROM gradle:6.3.0-jdk8 as builder
USER root
WORKDIR /builder
ADD . /builder
RUN gradle build --stacktrace

FROM openjdk:8-jre-alpine
WORKDIR /app
EXPOSE 8080
COPY --from=builder /builder/build/libs/docreator*.jar server.jar
CMD ["java", "-jar", "server.jar"]

# Docreator
[![Build Status](https://travis-ci.org/docreators/docreateor.svg?branch=master)](https://travis-ci.org/docreators/docreateor)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=docreators_docreateor&metric=alert_status)](https://sonarcloud.io/dashboard?id=docreators_docreateor)
## Requirements

- Java 8
- Docker

## Build
To build application use command: 
```sh
./gradlew build
```

### Docker

#### Building docker image 

```sh
docker build .
```
Then run composer while setting up dev env:
 
```sh
docker-compose up 
```
# Docreator
[![Build Status](https://travis-ci.org/docreators/docreateor.svg?branch=master)](https://travis-ci.org/docreators/docreateor)

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
# Converter Service

[![Tests](https://github.com/igalaxy00/Converter/actions/workflows/gradle-tests.yml/badge.svg?branch=master)](https://github.com/igalaxy00/Converter/actions/workflows/gradle-tests.yml) )
(Develop
[![Tests](https://github.com/igalaxy00/Converter/actions/workflows/gradle-tests.yml/badge.svg?branch=develop)](https://github.com/igalaxy00/Converter/actions/workflows/gradle-tests.yml) )

Simple converter which takes HTTP POST request with [DEGREES ,MINUTES] parametres and returns [SECONDS,RADIANS] response.

## How to use

To convert degrees -> seconds you can send request on
``` 
0.0.0.0:8080/convert/degree?degrees=<your degrees>
```
To convert minutes -> seconds you can send request on
``` 
0.0.0.0:8080/convert/minute?minute=<your minutes>
```
To convert degrees -> radians you can send request on
``` 
0.0.0.0:8080/convert/radians?degrees=<your degrees>
```

## How to run with docker
Clone repository:
``` console
$ git clone https://github.com/igalaxy00/Converter.git
```
CD into app folder:
``` console
$ cd converter
```
Build docker image:
``` console
$ docker build -t SimpleConverter
```
Run docker image:
``` console
$ docker run -p 8080:8080 SimpleConverter
```

## Lisense
We're [Apache ](./LICENSE) licensed.



## Build status
![Build status](https://github.com/luizgustavocosta/16-bits-quarkus/workflows/Java%20CI%20with%20Maven/badge.svg) 

## Sonar
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=luizgustavocosta_16-bits-quarkus&metric=alert_status)](https://sonarcloud.io/dashboard?id=luizgustavocosta_16-bits-quarkus)

# Quarkus
Quarkus is a full-stack, Kubernetes-native, Java Application Framework tailored for OpenJDK HotSpot and GraalVM. Comparatively to other frameworks, such as Spring, it offers small memory footprint and reduced boot time. It allows to combine both imperative code and non-blocking reactive style

## Introduction
This project is to be the playground about Quarkus

## How to run
Do a git clone of the project using
```bash
git clone https://github.com/luizgustavocosta/16-bits-quarkus.git
```

Then, change the directory
```bash
cd 16-bits-quarkus
```

Execute the Maven command
```maven
mvn compile quarkus:dev
```

Access the project through the address http://localhost:8080.

The available apis are:


```http
GET /api/campaigns/?api_key=12345678901234567890123456789012

POST /api/campaigns/?api_key=12345678901234567890123456789012

DELETE /api/campaigns/?api_key=12345678901234567890123456789012

PUT /api/campaigns/?api_key=12345678901234567890123456789012

```


| Parameter | Type | Description |
| :--- | :--- | :--- |
| `api_key` | `string` | **Required**. Your Gophish API key |


```javascript
{
  "message" : string,
  "success" : bool,
  "data"    : string
}
```

```javascript
{
  "message" : string,
  "success" : bool,
  "data"    : string
}
```

## Status Codes

Gophish returns the following status codes in its API:

| Status Code | Description |
| :--- | :--- |
| 200 | `OK` |
| 201 | `CREATED` |
| 400 | `BAD REQUEST` |
| 404 | `NOT FOUND` |

## Parts
[Hello World](static/helloworld/HelloWorld.md)

[JaCoCo](static/jacoco/Readme.md)

## From YouTube videos

[![](http://img.youtube.com/vi/2v5R2Go1dmU/0.jpg)](https://youtu.be/2v5R2Go1dmU)

[![](http://img.youtube.com/vi/80A7SS2H4VI/0.jpg)](https://youtu.be/80A7SS2H4VI)

[![](http://img.youtube.com/vi/2Vaqq6AokSs/0.jpg)](https://youtu.be/2Vaqq6AokSs)

[![](http://img.youtube.com/vi/hA2reppevKo/0.jpg)](https://youtu.be/hA2reppevKo)


## References
[Markdown](https://guides.github.com/features/mastering-markdown/)

[Markdown cheat sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)

[Emoji cheat sheet](https://github.com/ikatyang/emoji-cheat-sheet/blob/master/README.md)

[Api](https://github.com/gophish/api-documentation/edit/master/README.md)
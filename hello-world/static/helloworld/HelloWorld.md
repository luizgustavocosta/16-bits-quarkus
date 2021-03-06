## Build status
![Build status](https://github.com/luizgustavocosta/16-bits-quarkus/workflows/Java%20CI%20with%20Maven/badge.svg) 


# Quarkus

## Introduction
This is the Quarkus project, that's it.

## How to run?

### By terminal
By terminal use the command ``mvn compile quarkus:dev``

![](static/helloworld/mvn-dev.png) 
..
![](static/helloworld/mvn-dev-success.png) 

### By jar
Execute the command ``mvn clean package``

![](static/helloworld/mvn-package.png) 
..........
![](static/helloworld/mvn-success.png) 

After the package the project execute the following command into your terminal

``java -jar target/hello-world-0.0.1-SNAPSHOT.jar``

![](static/helloworld/running.png)

*Please, check again the message*, the application has started in 0.688s, is really fast!!  


## How to call

### cURL
cURL runs on terminal, so open the terminal and execute the following code 
``curl http://localhost:8080/api/quarkus/helloworld/Socrates``

![](static/helloworld/curl.png)

### Browser

Using the browser, just type ``http://localhost:8080/api/quarkus/helloworld/nero``

![](static/helloworld/browser.png)
 
 
### By docker

#### Build the image
docker build -t spring/hello-docker .

#### List images

``docker image ls``

#### Run
``docker run -p<expose port>:<internal port>  <imageid>``
 
``docker run -p8090:8090 a0733cb9a156``

#### See all containers
``docker container ls``

#### Run container
``docker exec -it <container_id> /bin/bash``
 
``docker exec -it 2c0b30ec415d /bin/bash``

#### Stop and remove containers
``docker stop $(docker ps -a -q)``

``docker rm $(docker ps -a -q)``

### Remove all images
``docker system prune``

### Remove all images 
``docker rmi -f $(docker images -a -q)``

#### See the Linux version
``docker exec -it 79c270d6d39e cat /etc/os-release``

### JVM
``./mvnw package``

``docker build -f src/main/docker/Dockerfile.jvm -t 16bits/quarkus-hello-world-jvm:0.0.1 .``

``docker run -i --rm -p 8080:8080 16bits/quarkus-hello-world-jvm:0.0.1``

### Native
``export JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-20.3.0/Contents/Home``

``export GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-java11-20.3.0/Contents/Home``

``./mvnw package -Pnative -Dquarkus.native.container-build=true -Dquarkus.container-image.build=true`` 

``docker build -f src/main/docker/Dockerfile.native -t 16bits/quarkus-hello-world-native:0.0.1 .``

``docker run -i --rm -p 8080:8080 16bits/quarkus-hello-world-native:0.0.1``
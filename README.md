# Spring Native & GraalVM demo project

This is the demo code to my blog article about Spring Native and GraalVM, see:
https://agile-coding.blogspot.com/2021/06/graalvm.html

Maven command to build the native image:
mvn spring-boot:build-image

Docker command to run the native image as Docker container:
docker run -p 8080:8080 graalvm:0.5

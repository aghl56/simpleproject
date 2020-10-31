FROM maven:3.5.2-jdk-8-alpine

COPY /target/simpleproject-1.0.jar myproject.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom","-jar","/myproject.jar"]
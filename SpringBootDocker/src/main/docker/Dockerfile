FROM openjdk:8-jdk-alpine
MAINTAINER vishnukant.dubey@lowes.com
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE}  docker-demo-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","docker-demo-0.0.1.jar"]


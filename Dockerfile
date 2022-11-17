FROM openjdk:17-jdk-alpine

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

ENV	USE_PROFILE docker

ENTRYPOINT ["java", "-Dspring.profiles.active=${USE_PROFILE}", "-jar", "app.jar"]
FROM openjdk:21-jdk-slim

LABEL authors="erick"

WORKDIR /app

COPY target/tapronto-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
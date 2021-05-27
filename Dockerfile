FROM openjdk:17

RUN mkdir -p /app/app-web

COPY target/yaraBeauty-1.0-SNAPSHOT.jar /app/app-web/app.jar
EXPOSE 8080
EXPOSE 5432
ENTRYPOINT ["java", "-jar", "/app/app-web/app.jar"]
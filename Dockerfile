FROM openjdk:17.0.1-jdk-slim
COPY build/libs/helloworld-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
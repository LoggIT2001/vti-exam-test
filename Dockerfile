FROM eclipse-temurin:21-jdk

WORKDIR /application

COPY target/exam-0.0.1-SNAPSHOT.jar application.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]
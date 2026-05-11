FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY flight-system/pom.xml .
COPY flight-system/src ./src
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "/app.jar" ]

FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package
EXPOSE 8080
CMD ["java", ".jar", "target"/flightsystem.jar]

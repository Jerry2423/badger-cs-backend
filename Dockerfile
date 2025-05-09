FROM maven:3.9.6-eclipse-temurin-21-alpine as build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21
COPY --from=build /target/backend-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]

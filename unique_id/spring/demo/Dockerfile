FROM maven:3.9-eclipse-temurin-21 as build

WORKDIR /app

COPY . .

RUN mvn clean package -DskipTests

#==============#

FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/demo.jar"]
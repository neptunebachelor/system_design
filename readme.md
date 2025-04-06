Unqiue_id in distriubted system



# Commands
# docker maven latest - maven clean build
docker run -it --rm -v "%cd%":/usr/src/app -v "%USERPROFILE%/.m2":/root/.m2 -w /usr/src/app maven:latest mvn clean package

# docker maven latest - maven spring-boot:run
docker run -it --rm -v "%cd%":/app -v "%USERPROFILE%\.m2":/root/.m2 -w /app -p 8080:8080 maven:3.9-eclipse-temurin-21 mvn spring-boot:run

# docker elcipse-temurin jre
docker run -it --rm ^
  -p 8080:8080 ^
  -v "%cd%\target\demo-0.0.1-SNAPSHOT.jar":/app.jar ^
  eclipse-temurin:21-jre ^
  java -jar /app.jar
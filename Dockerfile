FROM ubuntu:latest AS build

RUN apt-get update && apt-get install -y openjdk-17-jdk

WORKDIR /app

COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim
EXPOSE 8080

WORKDIR /app

COPY --from=build /app/target/techinfo-0.0.1-SNAPSHOT.jar application.jar

CMD ["java", "-jar", "application.jar"]
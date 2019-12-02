FROM maven:3.6.1-jdk-8-alpine as build

RUN mkdir source

COPY ./ source/

WORKDIR /source

RUN mvn clean install -U

FROM openjdk:8-alpine

RUN mkdir app

WORKDIR /app

COPY --from=build /source/target/*.jar /app/.

ENV SPRING_PROFILES_ACTIVE=postgres

ENTRYPOINT ["java", "-jar", "simpleproject-0.0.1-SNAPSHOT.jar"]
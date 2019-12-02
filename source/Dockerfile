FROM maven:3.6.1-jdk-8-alpine

RUN mkdir app

COPY ./ app/

WORKDIR /app

RUN mvn clean install -U

ENV SPRING_PROFILES_ACTIVE=postgres

ENTRYPOINT ["java", "-jar", "target/simpleproject-0.0.1-SNAPSHOT.jar"]

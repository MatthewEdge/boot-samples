FROM openjdk:13-alpine

# Allow override of Spring profile with `docker build --build-arg PROFILE="prod"`
ARG PROFILE="default"

COPY ./build/libs/app.jar /usr/src/app/app.jar

CMD java -Dspring.profiles.active=${PROFILE} -jar /usr/src/app/app.jar

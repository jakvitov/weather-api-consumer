FROM openjdk:18-oracle

WORKDIR /app

EXPOSE 8080

COPY /build/libs/weather-api-consumer*.jar  /app/wac.jar

CMD [ "java" , "-jar", "/app/wac.jar"]




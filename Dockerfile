FROM openjdk:18-oracle

WORKDIR /wac

#Setting the ninjas key as build container argument
ARG API_NINJAS_KEY
ENV API_NINJAS_KEY=${API_NINJAS_KEY}

EXPOSE 8080

COPY /build/libs/weather-api-consumer*  /app/wac.jar

CMD [ "java" , "-jar", "/app/wac.jar"]




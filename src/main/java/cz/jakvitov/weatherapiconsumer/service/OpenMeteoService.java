package cz.jakvitov.weatherapiconsumer.service;


import cz.jakvitov.controller_response.WeatherForecastResponseDto;
import reactor.core.publisher.Mono;

public interface OpenMeteoService {

    public Mono<WeatherForecastResponseDto> getWeatherForecast(Double latitude, Double longitude, Integer days);

}

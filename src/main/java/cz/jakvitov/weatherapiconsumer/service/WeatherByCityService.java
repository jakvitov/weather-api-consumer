package cz.jakvitov.weatherapiconsumer.service;


import cz.jakvitov.controller_response.WeatherForecastResponseDto;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Service to get weather forecast by city name
 */
public interface WeatherByCityService {

    public Mono<ResponseEntity<WeatherForecastResponseDto>> getWeatherForecastForCity(String city, Integer days);

}

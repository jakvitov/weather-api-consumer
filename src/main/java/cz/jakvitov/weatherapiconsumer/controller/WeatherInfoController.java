package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.weatherapiconsumer.client.WeatherApiService;
import cz.jakvitov.weatherapiconsumer.dto.TwoDaysWeatherResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherInfoController {

    @Autowired
    private WeatherApiService weatherApiService;

    @GetMapping("/info")
    public Mono<TwoDaysWeatherResponseDto> twoDaysWeatherResponseDto(){
        return weatherApiService.getHourlyTwoDaysWeatherForecast();
    }

}

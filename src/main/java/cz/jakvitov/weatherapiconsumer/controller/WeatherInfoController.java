package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.weatherapiconsumer.client.WeatherApiService;
import cz.jakvitov.weatherapiconsumer.dto.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.utils.WeatherUriBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
public class WeatherInfoController {

    @Autowired
    private WeatherApiService weatherApiService;

    //Default forecast value is two days
    @GetMapping("/getForecast")
    public Mono<WeatherForecastResponseDto> twoDaysWeatherResponse(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude){
        return weatherApiService.getHourlyTwoDaysWeatherForecast(latitude, longitude);
    }


    //Custom forecast length
    @GetMapping("/getForecast")
    public Mono<WeatherForecastResponseDto> customDaysWeatherResponse(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude, @RequestParam Integer days){
        return weatherApiService.getHourlyTwoDaysWeatherForecast(latitude, longitude, days);
    }

}

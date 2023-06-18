package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.weatherapiconsumer.client.WeatherApiService;
import cz.jakvitov.weatherapiconsumer.dto.WeatherForecastResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherInfoController {

    @Autowired
    private WeatherApiService weatherApiService;

    //Custom forecast length
    @GetMapping("/getForecast")
    public Mono<WeatherForecastResponseDto> customDaysWeatherResponse(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude, @RequestParam Integer days){
        if (days == null){
            days = 2;
        }
        return weatherApiService.getHourlyTwoDaysWeatherForecast(latitude, longitude, days);
    }

}

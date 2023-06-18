package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.weatherapiconsumer.dto.controller_response.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.service.OpenMeteoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class WeatherInfoController {

    @Autowired
    private OpenMeteoService openMeteoService;

    //Custom forecast length
    @GetMapping("/getForecast")
    public Mono<ResponseEntity<WeatherForecastResponseDto>> customDaysWeatherResponse(@RequestParam("latitude") Double latitude, @RequestParam("longitude") Double longitude, @RequestParam Integer days){
        if (days == null){
            days = 2;
        }
        return openMeteoService.getWeatherForecast(latitude, longitude, days).map((weatherForecastResponseDto ->
            new ResponseEntity<WeatherForecastResponseDto>(weatherForecastResponseDto, HttpStatusCode.valueOf(200))
        ));
    }

}

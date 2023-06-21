package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.weatherapiconsumer.dto.controller_response.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.service.OpenMeteoService;
import cz.jakvitov.weatherapiconsumer.service.WeatherByCityService;
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

    @Autowired
    private WeatherByCityService weatherByCityService;

    //Custom forecast length
    @GetMapping("/forecast/geocodes")
    public Mono<ResponseEntity<WeatherForecastResponseDto>> customDaysWeatherResponse(@RequestParam(value = "latitude", required = true) Double latitude, @RequestParam(value = "longitude", required = true) Double longitude, @RequestParam(value = "days", required = false) Integer days){
        if (days == null){
            days = 2;
        }
        return openMeteoService.getWeatherForecast(latitude, longitude, days).map((weatherForecastResponseDto ->
            new ResponseEntity<WeatherForecastResponseDto>(weatherForecastResponseDto, HttpStatusCode.valueOf(200))
        ));
    }

    @GetMapping("forecast/cityname")
    public Mono<ResponseEntity<WeatherForecastResponseDto>> getForecastForCityName(@RequestParam(value = "city", required = true) String city, @RequestParam(value = "days", required = false) Integer days){
        if (days == null){
            days = 2;
        }
        return weatherByCityService.getWeatherForecastForCity(city, days).log();
    }

}

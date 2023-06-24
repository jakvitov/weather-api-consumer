package cz.jakvitov.weatherapiconsumer.service;

import cz.jakvitov.controller_response.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.client.WeatherApiService;
import cz.jakvitov.weatherapiconsumer.utils.ResponseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OpenMeteoServiceImpl implements  OpenMeteoService{

    @Autowired
    WeatherApiService weatherApiService;

    @Autowired
    ResponseObjectMapper responseObjectMapper;

    @Override
    public Mono<WeatherForecastResponseDto> getWeatherForecast(Double latitude, Double longitude, Integer days) {
        if (days == null){
            days = 2;
        }
        return weatherApiService.getHourlyTwoDaysWeatherForecast(latitude, longitude, days).map(openMeteoWeatherForecastResponseDto ->
            responseObjectMapper.openMeteoDtoToWeatherForecastResponseDto(openMeteoWeatherForecastResponseDto)
        );
    }
}

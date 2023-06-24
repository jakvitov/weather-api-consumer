package cz.jakvitov.weatherapiconsumer.service;

import cz.jakvitov.controller_response.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.client.GeocodingApiService;
import cz.jakvitov.weatherapiconsumer.client.WeatherApiService;
import cz.jakvitov.weatherapiconsumer.utils.ResponseObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class WeatherByCityServiceImpl implements  WeatherByCityService{

    @Autowired
    GeocodingApiService geocodingApiService;

    @Autowired
    WeatherApiService weatherApiService;

    @Autowired
    ResponseObjectMapper responseObjectMapper;

    @Override
    public Mono<ResponseEntity<WeatherForecastResponseDto>> getWeatherForecastForCity(String city, Integer days) {
        return geocodingApiService.translateCityNameToGeocoding(city).flatMap(res ->
                weatherApiService.getHourlyTwoDaysWeatherForecast(res.getCities().get(0).getLatitude(), res.getCities().get(0).getLongitude(), days)
                        .map(response -> new ResponseEntity<>(responseObjectMapper.openMeteoDtoToWeatherForecastResponseDto(response), HttpStatusCode.valueOf(200)))
        );
    }
}

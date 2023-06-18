package cz.jakvitov.weatherapiconsumer.client;

import cz.jakvitov.weatherapiconsumer.dto.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.utils.WeatherUriBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherApiService {

    @Autowired
    WeatherUriBuilder weatherUriBuilder;

    @Autowired
    private WebClient webClient;

    public Mono<WeatherForecastResponseDto> getHourlyTwoDaysWeatherForecast(Double latitude, Double longitude){
        return webClient.get().uri(weatherUriBuilder.buildDailyForecastGetRequestUri(latitude, longitude, 2)).retrieve().bodyToMono(WeatherForecastResponseDto.class);
    }

    public Mono<WeatherForecastResponseDto> getHourlyTwoDaysWeatherForecast(Double latitude, Double longitude, Integer days){
        return webClient.get().uri(weatherUriBuilder.buildDailyForecastGetRequestUri(latitude, longitude, days)).retrieve().bodyToMono(WeatherForecastResponseDto.class);
    }


}

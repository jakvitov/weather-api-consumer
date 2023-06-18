package cz.jakvitov.weatherapiconsumer.client;

import cz.jakvitov.weatherapiconsumer.dto.open_meteo.OpenMeteoWeatherForecastResponseDto;
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


    public Mono<OpenMeteoWeatherForecastResponseDto> getHourlyTwoDaysWeatherForecast(Double latitude, Double longitude, Integer days){
        return webClient.get().uri(weatherUriBuilder.buildDailyForecastGetRequestUri(latitude, longitude, days)).retrieve().bodyToMono(OpenMeteoWeatherForecastResponseDto.class);
    }


}

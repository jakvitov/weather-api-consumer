package cz.jakvitov.weatherapiconsumer.client;

import cz.jakvitov.open_meteo.OpenMeteoErrorResponseDto;
import cz.jakvitov.open_meteo.OpenMeteoWeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.exceptions.OpenMeteoErrorResponseException;
import cz.jakvitov.weatherapiconsumer.utils.WeatherUriBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
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
        return webClient.get().uri(weatherUriBuilder.buildDailyForecastGetRequestUri(latitude, longitude, days)).retrieve()
                .onStatus((HttpStatusCode::isError), response ->
                    response.bodyToMono(OpenMeteoErrorResponseDto.class).flatMap(res -> Mono.error(new OpenMeteoErrorResponseException(res)))
                    )
                .bodyToMono(OpenMeteoWeatherForecastResponseDto.class);
    }


}

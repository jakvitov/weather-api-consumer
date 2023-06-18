package cz.jakvitov.weatherapiconsumer.client;

import cz.jakvitov.weatherapiconsumer.dto.TwoDaysWeatherResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WeatherApiService {

    private final String TWO_DAYS_WEATHER_RESPONSE_API_URI = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m,windspeed_10m,rain,weathercode&forecast_days=2";

    @Autowired
    private WebClient webClient;

    public Mono<TwoDaysWeatherResponseDto> getHourlyTwoDaysWeatherForecast(){
        return webClient.get().uri(TWO_DAYS_WEATHER_RESPONSE_API_URI).retrieve().bodyToMono(TwoDaysWeatherResponseDto.class);
    }


}

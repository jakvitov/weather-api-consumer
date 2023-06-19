package cz.jakvitov.weatherapiconsumer.client;

import cz.jakvitov.weatherapiconsumer.dto.geocoding.GeocodingErrorResponseDto;
import cz.jakvitov.weatherapiconsumer.dto.geocoding.GeocodingResponseDto;
import cz.jakvitov.weatherapiconsumer.exceptions.GeocodingApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * Service allowing calling ninajs api to translate city name to longitude and latitude
 */
@Service
public class GeocodingApiService {

    @Autowired
    private WebClient webClient;

    private Mono<GeocodingResponseDto> translateCityNameToGeocoding(String city){
        return webClient.get().uri("https://api.api-ninjas.com/v1/geocoding?city=" + city)
                .header("X-Api-Key", System.getenv("API_NINJAS_KEY")).retrieve()
                .onStatus(HttpStatusCode::isError, response -> response.bodyToMono(GeocodingErrorResponseDto.class)
                        .flatMap((res) -> Mono.error(new GeocodingApiException(res))))
                .bodyToMono(GeocodingResponseDto.class);
    }

}

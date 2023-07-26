package cz.jakvitov.weatherapiconsumer.controller;

import cz.jakvitov.geocoding.GeocodingResponseDto;
import cz.jakvitov.weatherapiconsumer.client.GeocodingApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/translate")
public class WeatherTranslationController {

    @Autowired
    private GeocodingApiService geocodingApiService;

    @GetMapping("/translate/namesToGeocodes")
    public Mono<ResponseEntity<GeocodingResponseDto>> getGeocodesForCityByName(@RequestParam(value = "city", required = true) String city, @RequestParam(value = "countryIso", required = true) String countryISO){
        return geocodingApiService.translateCityNameToGeocoding(city).map((resp) ->
                new ResponseEntity<>(resp, HttpStatusCode.valueOf(200))
        );
    }

}

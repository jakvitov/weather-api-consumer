package cz.jakvitov.weatherapiconsumer.utils;


import cz.jakvitov.weatherapiconsumer.types.WeatherOptions;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

/**
 * Util class to build the request for the Weather
 */
public class WeatherUriBuilder {

    final String defaultApiUrl = "https://api.open-meteo.com/v1/forecast";

    public String buildDailyForecastGetRequestUri(Double latitude, Double longitude, Integer numberOfDays){
        return UriComponentsBuilder.fromHttpUrl(defaultApiUrl)
                .queryParam(WeatherOptions.LATITUDE.getValue(), latitude)
                .queryParam(WeatherOptions.LONGITUDE.getValue(), longitude)
                .queryParam(WeatherOptions.DAYS.getValue(), numberOfDays)
                .queryParam(WeatherOptions.HOURLY_OPTIONS.getValue(),
                        Arrays.asList(WeatherOptions.TEMPERATURE.getValue(), WeatherOptions.RAIN.getValue()
                                , WeatherOptions.WIND_SPEED.getValue(), WeatherOptions.WEATHER_CODE.getValue()))
                .toUriString();
    }

}

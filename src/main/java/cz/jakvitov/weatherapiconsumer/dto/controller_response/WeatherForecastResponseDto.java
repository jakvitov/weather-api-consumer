package cz.jakvitov.weatherapiconsumer.dto.controller_response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * This services response for weather info request
 */
public class WeatherForecastResponseDto extends AbstractControllerResponse{

    @NotNull
    @JsonProperty("days_forecast")
    List<WeatherInfoForDayDto> daysForecast;

    public WeatherForecastResponseDto() {
    }

    public List<WeatherInfoForDayDto> getDaysForecast() {
        return daysForecast;
    }

    public void setDaysForecast(List<WeatherInfoForDayDto> daysForecast) {
        this.daysForecast = daysForecast;
    }
}

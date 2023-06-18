package cz.jakvitov.weatherapiconsumer.dto.controller_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.jakvitov.weatherapiconsumer.types.WeatherCode;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * Weather information at the given hour
 */
public class WeatherInfoForHourInfoDto {

    @NotNull
    private LocalDateTime time;

    @NotNull
    private Double temperature;

    @NotNull
    private Double windspeed;

    @NotNull
    @Min(0)
    private Double rain;

    @NotNull
    @JsonProperty("weather_name")
    private WeatherCode weatherName;

    public WeatherInfoForHourInfoDto() {
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(Double windspeed) {
        this.windspeed = windspeed;
    }

    public Double getRain() {
        return rain;
    }

    public void setRain(Double rain) {
        this.rain = rain;
    }

    public WeatherCode getWeatherName() {
        return weatherName;
    }

    public void setWeatherName(WeatherCode weatherName) {
        this.weatherName = weatherName;
    }
}

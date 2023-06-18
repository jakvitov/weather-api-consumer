package cz.jakvitov.weatherapiconsumer.dto.open_meteo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

/**
 * Dto representing hourly units in Weather response
 */
public class HourlyUnitsDto {

    @NotNull
    private String time;

    @JsonProperty("temperature_2m")
    private String temperature2m;

    @JsonProperty("windspeed_10m")
    private String windspeed10m;

    private String rain;

    private String weathercode;

    public HourlyUnitsDto() {
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(String temperature2m) {
        this.temperature2m = temperature2m;
    }

    public String getWindspeed10m() {
        return windspeed10m;
    }

    public void setWindspeed10m(String windspeed10m) {
        this.windspeed10m = windspeed10m;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }

    public String getWeathercode() {
        return weathercode;
    }

    public void setWeathercode(String weathercode) {
        this.weathercode = weathercode;
    }
}

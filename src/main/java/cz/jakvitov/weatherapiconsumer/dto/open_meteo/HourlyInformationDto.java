package cz.jakvitov.weatherapiconsumer.dto.open_meteo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.cglib.core.Local;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * Dto containing hourly weather info
 */

public class HourlyInformationDto {

    @NotNull
    private ArrayList<LocalDateTime> time;

    @JsonProperty("temperature_2m")
    private ArrayList<Double> temperature2m;

    @JsonProperty("windspeed_10m")
    private ArrayList<Double> windspeed10m;

    private ArrayList<Double> rain;

    @JsonProperty("weathercode")
    private ArrayList<Integer> weatherCode;

    public HourlyInformationDto() {
    }

    public ArrayList<LocalDateTime> getTime() {
        return time;
    }

    public void setTime(ArrayList<LocalDateTime> time) {
        this.time = time;
    }

    public ArrayList<Double> getTemperature2m() {
        return temperature2m;
    }

    public void setTemperature2m(ArrayList<Double> temperature2m) {
        this.temperature2m = temperature2m;
    }

    public ArrayList<Double> getWindspeed10m() {
        return windspeed10m;
    }

    public void setWindspeed10m(ArrayList<Double> windspeed10m) {
        this.windspeed10m = windspeed10m;
    }

    public ArrayList<Double> getRain() {
        return rain;
    }

    public void setRain(ArrayList<Double> rain) {
        this.rain = rain;
    }

    public ArrayList<Integer> getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(ArrayList<Integer> weatherCode) {
        this.weatherCode = weatherCode;
    }
}

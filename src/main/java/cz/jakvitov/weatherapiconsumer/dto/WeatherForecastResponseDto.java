package cz.jakvitov.weatherapiconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Entity representing a standard hourly weather forecast response with two days forecast
 */
public class WeatherForecastResponseDto extends AbstractOpenMeteoWeatherResponse{

    @NotNull
    @Valid
    @JsonProperty("hourly_units")
    private HourlyUnitsDto hourlyUnits;

    @NotNull
    private HourlyInformationDto hourly;

    public WeatherForecastResponseDto() {
    }

    public HourlyUnitsDto getHourlyUnits() {
        return hourlyUnits;
    }

    public void setHourlyUnits(HourlyUnitsDto hourlyUnits) {
        this.hourlyUnits = hourlyUnits;
    }

    public HourlyInformationDto getHourly() {
        return hourly;
    }

    public void setHourly(HourlyInformationDto hourly) {
        this.hourly = hourly;
    }
}

package cz.jakvitov.weatherapiconsumer.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import reactor.util.annotation.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Entity representing a standard hourly weather forecast response with two days forecast
 */
public class TwoDaysWeatherResponseDto extends AbstractOpenMeteoWeatherResponse{

    @NotNull
    @Valid
    @JsonProperty("hourly_units")
    private HourlyUnitsDto hourlyUnits;

    @NotNull
    private HourlyInformationDto hourly;

    public TwoDaysWeatherResponseDto() {
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

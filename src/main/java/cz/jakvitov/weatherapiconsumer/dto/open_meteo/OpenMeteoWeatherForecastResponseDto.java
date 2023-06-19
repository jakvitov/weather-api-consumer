package cz.jakvitov.weatherapiconsumer.dto.open_meteo;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;


/**
 * Entity representing a standard hourly weather forecast response with forecast from third party weather service
 */
public class OpenMeteoWeatherForecastResponseDto extends AbstractOpenMeteoWeatherResponse {

    @NotNull
    @Valid
    @JsonProperty("hourly_units")
    private HourlyUnitsDto hourlyUnits;

    @NotNull
    private HourlyInformationDto hourly;

    public OpenMeteoWeatherForecastResponseDto() {
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

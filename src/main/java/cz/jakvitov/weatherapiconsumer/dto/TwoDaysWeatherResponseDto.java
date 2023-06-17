package cz.jakvitov.weatherapiconsumer.dto;

import reactor.util.annotation.NonNull;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Entity representing a standard hourly weather forecast response with two days forecast
 */
public class TwoDaysWeatherResponseDto extends AbstractOpenMeteoWeatherResponse{

    @NotNull
    @Valid
    private HourlyUnitsDto hourlyUnitsDto;

    @NotNull
    private HourlyInformationDto hourlyInformationDto;

    public TwoDaysWeatherResponseDto() {
    }

    public HourlyUnitsDto getHourlyUnitsDto() {
        return hourlyUnitsDto;
    }

    public void setHourlyUnitsDto(HourlyUnitsDto hourlyUnitsDto) {
        this.hourlyUnitsDto = hourlyUnitsDto;
    }

    public HourlyInformationDto getHourlyInformationDto() {
        return hourlyInformationDto;
    }

    public void setHourlyInformationDto(HourlyInformationDto hourlyInformationDto) {
        this.hourlyInformationDto = hourlyInformationDto;
    }
}

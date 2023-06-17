package cz.jakvitov.weatherapiconsumer.dto;

import reactor.util.annotation.NonNull;

import javax.validation.constraints.NotNull;

/**
 * Entity representing a standard hourly weather forecast response with two days forecast
 */
public class TwoDaysWeatherResponseDto extends AbstractOpenMeteoWeatherResponse{

    @NotNull
    private HourlyUnitsDto hourlyUnitsDto;



}

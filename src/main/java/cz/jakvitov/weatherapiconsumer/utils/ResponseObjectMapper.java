package cz.jakvitov.weatherapiconsumer.utils;

import cz.jakvitov.weatherapiconsumer.dto.controller_response.WeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.dto.controller_response.WeatherInfoForDayDto;
import cz.jakvitov.weatherapiconsumer.dto.controller_response.WeatherInfoForHourInfoDto;
import cz.jakvitov.weatherapiconsumer.dto.open_meteo.OpenMeteoWeatherForecastResponseDto;
import cz.jakvitov.weatherapiconsumer.types.WeatherCode;

import java.util.ArrayList;

/**
 * A class that helps to map different response dtos between systems
 */
public class ResponseObjectMapper {

    public WeatherForecastResponseDto openMeteoDtoToWeatherForecastResponseDto(OpenMeteoWeatherForecastResponseDto openMeteoWeatherForecastResponseDto){
        WeatherForecastResponseDto weatherForecastResponseDto = new WeatherForecastResponseDto();
        weatherForecastResponseDto.setDaysForecast(new ArrayList<WeatherInfoForDayDto>());
        for (int i = 0; i < openMeteoWeatherForecastResponseDto.getHourly().getTime().size()/24; i += 24){
            int endOfTheDayIndex = i + 24;
            WeatherInfoForDayDto weatherInfoForDayDto = new WeatherInfoForDayDto();
            weatherInfoForDayDto.setDate(openMeteoWeatherForecastResponseDto.getHourly().getTime().get(0).toLocalDate());
            weatherInfoForDayDto.setHourlyInfo(new ArrayList<WeatherInfoForHourInfoDto>(24));
            for (int k = i; k < endOfTheDayIndex; k ++){
                WeatherInfoForHourInfoDto weatherInfoForHourInfoDto = new WeatherInfoForHourInfoDto();
                weatherInfoForHourInfoDto.setTime(openMeteoWeatherForecastResponseDto.getHourly().getTime().get(k));
                weatherInfoForHourInfoDto.setRain(openMeteoWeatherForecastResponseDto.getHourly().getRain().get(k));
                weatherInfoForHourInfoDto.setWeatherName(WeatherCode.numberToWeatherCode(openMeteoWeatherForecastResponseDto.getHourly().getWeatherCode().get(k)));
                weatherInfoForHourInfoDto.setTemperature(openMeteoWeatherForecastResponseDto.getHourly().getTemperature2m().get(k));
                weatherInfoForHourInfoDto.setWindspeed(openMeteoWeatherForecastResponseDto.getHourly().getWindspeed10m().get(k));
                weatherInfoForDayDto.getHourlyInfo().add(weatherInfoForHourInfoDto);
            }
            weatherForecastResponseDto.getDaysForecast().add(weatherInfoForDayDto);
        }
        return weatherForecastResponseDto;
    }

}

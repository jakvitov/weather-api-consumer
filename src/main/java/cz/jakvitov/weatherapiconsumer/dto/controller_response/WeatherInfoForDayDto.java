package cz.jakvitov.weatherapiconsumer.dto.controller_response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

public class WeatherInfoForDayDto {

    @NotNull
    LocalDate date;

    @NotNull
    @JsonProperty("hourly_info")
    public List<WeatherInfoForHourInfoDto> hourlyInfo;

    public WeatherInfoForDayDto() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<WeatherInfoForHourInfoDto> getHourlyInfo() {
        return hourlyInfo;
    }

    public void setHourlyInfo(List<WeatherInfoForHourInfoDto> hourlyInfo) {
        this.hourlyInfo = hourlyInfo;
    }
}

package cz.jakvitov.weatherapiconsumer.dto.geocoding;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

/**
 * Response from api ninjas containing logitude and latitude of a city
 */
public class GeocodingResponseDto {

    @NotNull
    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private ArrayList<GeocodingCityInfoDto> cities;

    public GeocodingResponseDto() {
    }

    public ArrayList<GeocodingCityInfoDto> getCities() {
        return cities;
    }

    public void setCities(ArrayList<GeocodingCityInfoDto> cities) {
        this.cities = cities;
    }
}

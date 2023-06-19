package cz.jakvitov.weatherapiconsumer.dto.geocoding;

import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

/**
 * Response from api ninjas containing logitude and latitude of a city
 */
public class GeocodingResponseDto {

    @NotNull
    private ArrayList<GeocodingCityInfoDto> geocodingCityInfoDtos;

    public GeocodingResponseDto() {
    }

    public ArrayList<GeocodingCityInfoDto> getGeocodingCityInfoDtos() {
        return geocodingCityInfoDtos;
    }

    public void setGeocodingCityInfoDtos(ArrayList<GeocodingCityInfoDto> geocodingCityInfoDtos) {
        this.geocodingCityInfoDtos = geocodingCityInfoDtos;
    }
}

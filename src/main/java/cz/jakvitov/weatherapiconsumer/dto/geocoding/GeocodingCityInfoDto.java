package cz.jakvitov.weatherapiconsumer.dto.geocoding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 * Object containing info from API ninjas about one requested city longitude and latitude
 */
public class GeocodingCityInfoDto {

    @NotNull
    private String name;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;

    //ISO code of country 2 or 3-letters
    @Size(min = 2, max = 3)
    private String country;

    public GeocodingCityInfoDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

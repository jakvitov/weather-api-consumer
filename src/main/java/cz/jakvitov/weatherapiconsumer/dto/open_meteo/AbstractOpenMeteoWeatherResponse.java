package cz.jakvitov.weatherapiconsumer.dto.open_meteo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class containg basic informating in every response from OpenMeteo weather api request
 */
public abstract class AbstractOpenMeteoWeatherResponse {

    private Double latitude;

    private Double longitude;

    @JsonProperty("generationtime_ms")
    private Double generationTimeMs;

    @JsonProperty("utc_offset_seconds")
    private Long utcOffsetSeconds;

    private String timezone;

    @JsonProperty("timezone_abbreviation")
    private String timeAbberviation;

    private Double elevation;

    public AbstractOpenMeteoWeatherResponse() {
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

    public Double getGenerationTimeMs() {
        return generationTimeMs;
    }

    public void setGenerationTimeMs(Double generationTimeMs) {
        this.generationTimeMs = generationTimeMs;
    }

    public Long getUtcOffsetSeconds() {
        return utcOffsetSeconds;
    }

    public void setUtcOffsetSeconds(Long utcOffsetSeconds) {
        this.utcOffsetSeconds = utcOffsetSeconds;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getTimeAbberviation() {
        return timeAbberviation;
    }

    public void setTimeAbberviation(String timeAbberviation) {
        this.timeAbberviation = timeAbberviation;
    }

    public Double getElevation() {
        return elevation;
    }

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }
}

package cz.jakvitov.weatherapiconsumer.dto.geocoding;

/**
 * Dto for error response from ninjas api geocoding api
 */
public class GeocodingErrorResponseDto {

    private String message;

    public GeocodingErrorResponseDto() {
    }

    public GeocodingErrorResponseDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

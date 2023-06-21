package cz.jakvitov.weatherapiconsumer.dto.geocoding;

/**
 * Dto for error response from ninjas api geocoding api
 */
public class GeocodingErrorResponseDto {

    private String message;

    private String error;

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

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

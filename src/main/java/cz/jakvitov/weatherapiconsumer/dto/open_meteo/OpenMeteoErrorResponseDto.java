package cz.jakvitov.weatherapiconsumer.dto.open_meteo;

/**
 * Dto returned from open meteo in case of an error
 */
public class OpenMeteoErrorResponseDto {

    private boolean error;

    private String reason;

    public OpenMeteoErrorResponseDto() {
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

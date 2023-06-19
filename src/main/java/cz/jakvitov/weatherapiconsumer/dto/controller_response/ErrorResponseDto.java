package cz.jakvitov.weatherapiconsumer.dto.controller_response;

public class ErrorResponseDto extends AbstractControllerResponse{

    private String reason;

    public ErrorResponseDto() {
    }

    public ErrorResponseDto(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}

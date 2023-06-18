package cz.jakvitov.weatherapiconsumer.dto.controller_response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * Abstract template for all api responses
 */
public abstract class AbstractControllerResponse {

    @JsonProperty("generated_at")
    private LocalDateTime generatedAt;

    public AbstractControllerResponse() {
        this.generatedAt = LocalDateTime.now();
    }

    public LocalDateTime getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(LocalDateTime generatedAt) {
        this.generatedAt = generatedAt;
    }
}

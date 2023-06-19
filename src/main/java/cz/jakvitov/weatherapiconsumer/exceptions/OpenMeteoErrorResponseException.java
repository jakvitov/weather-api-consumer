package cz.jakvitov.weatherapiconsumer.exceptions;

import cz.jakvitov.weatherapiconsumer.dto.open_meteo.OpenMeteoErrorResponseDto;
import reactor.core.publisher.Mono;

public class OpenMeteoErrorResponseException extends RuntimeException{

    public OpenMeteoErrorResponseException(OpenMeteoErrorResponseDto error) {
        super(error.getReason());
    }


}

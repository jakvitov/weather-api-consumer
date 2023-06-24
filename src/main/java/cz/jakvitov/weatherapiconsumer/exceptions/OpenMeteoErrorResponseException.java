package cz.jakvitov.weatherapiconsumer.exceptions;

import cz.jakvitov.open_meteo.OpenMeteoErrorResponseDto;

public class OpenMeteoErrorResponseException extends RuntimeException{

    public OpenMeteoErrorResponseException(OpenMeteoErrorResponseDto error) {
        super(error.getReason());
    }


}

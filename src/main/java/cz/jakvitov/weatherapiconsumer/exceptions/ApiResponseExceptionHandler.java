package cz.jakvitov.weatherapiconsumer.exceptions;

import cz.jakvitov.weatherapiconsumer.dto.controller_response.ErrorResponseDto;
import cz.jakvitov.weatherapiconsumer.dto.open_meteo.OpenMeteoErrorResponseDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

/**
 * Handler for system exceptions that occur during the execution of the app
 */
@ControllerAdvice
public class ApiResponseExceptionHandler {

    @ExceptionHandler(OpenMeteoErrorResponseException.class)
    public ResponseEntity<ErrorResponseDto> handleOpenMeteoError(OpenMeteoErrorResponseException exc){
        return new ResponseEntity<>(new ErrorResponseDto(exc.getMessage()), HttpStatusCode.valueOf(503));
    }

}

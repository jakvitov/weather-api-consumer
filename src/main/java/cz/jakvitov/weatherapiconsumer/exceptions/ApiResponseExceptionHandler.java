package cz.jakvitov.weatherapiconsumer.exceptions;

import cz.jakvitov.weatherapiconsumer.dto.controller_response.ErrorResponseDto;
import cz.jakvitov.weatherapiconsumer.dto.geocoding.GeocodingResponseDto;
import io.micrometer.core.ipc.http.HttpSender;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Handler for system exceptions that occur during the execution of the app
 */
@ControllerAdvice
public class ApiResponseExceptionHandler {

    @ExceptionHandler(OpenMeteoErrorResponseException.class)
    public ResponseEntity<ErrorResponseDto> handleOpenMeteoError(OpenMeteoErrorResponseException exc){
        return new ResponseEntity<>(new ErrorResponseDto(exc.getMessage()), HttpStatusCode.valueOf(503));
    }

    @ExceptionHandler(NumberCodeNotFoundException.class)
    public ResponseEntity<ErrorResponseDto> handleDtoErrorException(NumberCodeNotFoundException exc){
        return new ResponseEntity<>(new ErrorResponseDto(exc.getMessage()), HttpStatusCode.valueOf(500));
    }

    @ExceptionHandler(GeocodingApiException.class)
    public ResponseEntity<ErrorResponseDto> handleGeocodingException(GeocodingApiException exc){
        return new ResponseEntity<>(new ErrorResponseDto(exc.getMessage()), HttpStatusCode.valueOf(503));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGeneralException(Exception exc){
        return  new ResponseEntity<>(new ErrorResponseDto(exc.getMessage()), HttpStatusCode.valueOf(500));
    }

}

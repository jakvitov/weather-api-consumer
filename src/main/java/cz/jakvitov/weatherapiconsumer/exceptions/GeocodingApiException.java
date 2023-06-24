package cz.jakvitov.weatherapiconsumer.exceptions;


import cz.jakvitov.geocoding.GeocodingErrorResponseDto;

public class GeocodingApiException extends RuntimeException{

    public GeocodingApiException(GeocodingErrorResponseDto geocodingErrorResponseDto) {
        super(geocodingErrorResponseDto.getMessage() + geocodingErrorResponseDto.getError());
    }
}

package cz.jakvitov.weatherapiconsumer.exceptions;

import cz.jakvitov.weatherapiconsumer.dto.geocoding.GeocodingErrorResponseDto;

public class GeocodingApiException extends RuntimeException{

    public GeocodingApiException(GeocodingErrorResponseDto geocodingErrorResponseDto) {
        super(geocodingErrorResponseDto.getMessage() + geocodingErrorResponseDto.getError());
    }
}

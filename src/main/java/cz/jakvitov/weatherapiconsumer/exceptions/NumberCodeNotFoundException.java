package cz.jakvitov.weatherapiconsumer.exceptions;

public class NumberCodeNotFoundException extends RuntimeException{

    public NumberCodeNotFoundException(Integer num) {
        super("Number code for weather " + num + " not found!");
    }
}

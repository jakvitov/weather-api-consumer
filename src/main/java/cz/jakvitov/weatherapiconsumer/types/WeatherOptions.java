package cz.jakvitov.weatherapiconsumer.types;

public enum WeatherOptions {

    DAYS("forecast_days"),
    LATITUDE("latitude"),
    LONGITUDE("longitude"),
    HOURLY_OPTIONS("hourly"),
    TEMPERATURE("temperature_2m"),
    WIND_SPEED("windspeed_10m"),
    RAIN("rain"),
    WEATHER_CODE("weathercode");


    private final String value;

    WeatherOptions(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}

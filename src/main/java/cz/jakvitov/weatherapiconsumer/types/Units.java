package cz.jakvitov.weatherapiconsumer.types;

/**
 * Enum representing valid format and units of weather values
 */
public enum Units {

    ISO8601_TIME_FORMAT("iso8601"),
    CELSIUS("°C"),
    KM_P_H("km/h"),
    MILIMETER("mm"),
    WMO_WEATHER_CODE("wmo code");

    private final String value;

    Units(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

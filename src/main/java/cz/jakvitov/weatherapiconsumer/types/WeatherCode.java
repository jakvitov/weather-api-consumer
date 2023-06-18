package cz.jakvitov.weatherapiconsumer.types;

import cz.jakvitov.weatherapiconsumer.exceptions.NumberCodeNotFoundException;

import static java.util.Arrays.stream;

/**
 * Weather codes with their Czech translation mapping
 */

public enum WeatherCode {

    CLEAR_SKY(0, "Jasno"),
    MAINLY_CLEAR(1, "Převážně jasno"),
    PARTLY_CLOUDY(2, "Částečně zataženo"),
    OVERCAST(3, "Zataženo"),
    FOG(45, "Mlha"),
    DESPOSING_FOG(48, "Mlha"),
    LIGHT_DRIZZLE(51, "Lehké mrholení"),
    MODERATE_DRIZZLE(53, "Střední mrholení"),
    DENSE_DRIZZLE(55, "Silné mrholení"),
    LIGHT_FREEZING_DRIZZLE(56, "Slabá námraza"),
    HEAVY_FREEZING_DRIZZLE(57, "Silná námraza"),
    LIGHT_RAIN(61, "Slabý déšť"),
    MEDIUM_RAIN(63, "Středně silný déšť"),
    HEAVY_RAIN(65, "Silný déšť"),
    LIGHT_FREEZING_RAIN(66, "Slabá námraza"),
    HEAVY_FREEZING_RAIN(67, "Silná námraza"),
    LIGHT_SNOW(71, "Slabé sněžení"),
    MODERATE_SNOW(73, "Sněžení"),
    HEAVY_SNOW(75, "Silné sněžení"),
    SNOW_GRAINS(77, "Kroupy"),
    LIGHT_RAIN_SHOWER(80, "Slabý déšť"),
    MODERATE_RAIN_SHOWER(81, "Středně silný déšť"),
    HEAVY_RAIN_SHOWER(82, "Silný déšť"),
    LIGHT_SNOW_SHOWER(85, "Slabé sněžení"),
    HEAVY_SNOW_SHOWER(86, "Silné sněžení"),
    THUNDERSTORM(95, "Bouřka"),
    THUNDERSTORM_LIGHT_HAIL(96, "Bouřka"),
    THUNDERSTORM_HEAVY_HAIL(99, "Bouřka");

    WeatherCode(Integer value, String translation){
        this.value = value;
        this.translation = translation;
    }

    final Integer value;
    final String translation;

    public static WeatherCode numberToWeatherCode(Integer num){
        return stream(WeatherCode.values()).filter((code) ->
            code.getValue().equals(num)
        ).findFirst().orElseThrow(() -> new NumberCodeNotFoundException(num));
    }

    public Integer getValue() {
        return value;
    }

    public String getTranslation() {
        return translation;
    }
}

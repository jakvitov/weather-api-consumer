package cz.jakvitov.weatherapiconsumer.types;

public class UnitUtils {

    public static boolean isInUnits(Units unit, String value){
        return value.equals(unit.getValue());
    }
}

package cz.jakvitov.weatherapiconsumer.utils;

import cz.jakvitov.weatherapiconsumer.types.Units;

public class UnitUtils {

    public static boolean isInUnits(Units unit, String value){
        return value.equals(unit.getValue());
    }
}

package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class Foot implements IUnit {
    private double conversionFactor = 12;


    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public IUnit baseUnit() {
        return new Inch();
    }

    @Override
    public UnitType typeOfUnit() {
        return UnitType.lengthTypeUnit;
    }

    @Override
    public String toString() {
        return "Foot{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

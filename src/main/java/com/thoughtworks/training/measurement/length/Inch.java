package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class Inch implements IUnit {
    private double conversionFactor = 1;


    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public IUnit baseUnit() {
        return this;
    }

    @Override
    public UnitType typeOfUnit() {
        return UnitType.lengthTypeUnit;
    }

    @Override
    public String toString() {
        return "Inch{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

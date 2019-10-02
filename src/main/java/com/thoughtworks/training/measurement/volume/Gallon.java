package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class Gallon implements IUnit {
    private double conversionFactor = 3.78;


    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public IUnit baseUnit() {
        return new Liter();
    }

    @Override
    public UnitType typeOfUnit() {
        return UnitType.volumeTypeUnit;
    }

    @Override
    public String toString() {
        return "Gallon{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class Liter implements IUnit {
    private double conversionFactor = 1;


    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public IUnit baseUnit() {
        return  this;
    }

    @Override
    public UnitType typeOfUnit() {
        return UnitType.volumeTypeUnit;
    }

    @Override
    public String toString() {
        return "Liter{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

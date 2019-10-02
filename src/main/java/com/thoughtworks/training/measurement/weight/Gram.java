package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class Gram implements IUnit {
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
        return UnitType.weightTypeUnit;
    }

    @Override
    public String toString() {
        return "Gram{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

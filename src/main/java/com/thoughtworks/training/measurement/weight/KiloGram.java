package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.UnitType;

public class KiloGram implements IUnit {
    private double conversionFactor = 1000;


    @Override
    public double conversionToBase(double value) {
        return value * conversionFactor;
    }

    @Override
    public IUnit baseUnit() {
        return new Gram();
    }

    @Override
    public UnitType typeOfUnit() {
        return UnitType.weightTypeUnit;
    }

    @Override
    public String toString() {
        return "KiloGram{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

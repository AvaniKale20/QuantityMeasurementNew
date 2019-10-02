package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;

public class Inch implements IUnit {
    private double conversionFactor = 1;

    @Override
    public Quantity conversionToBase(double value) {
        return Quantity.createInch(value * conversionFactor);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Inch;
    }

    @Override
    public String toString() {
        return "Inch{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

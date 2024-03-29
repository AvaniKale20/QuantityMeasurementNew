package com.thoughtworks.training.measurement.length;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.QuantityFactory;

public class Yard implements IUnit {
    private double conversionFactor = 36;

    @Override
    public Quantity conversionToBase(double value) {
        return QuantityFactory.createInch(value * conversionFactor);
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Yard;

    }

    @Override
    public String toString() {
        return "Yard{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

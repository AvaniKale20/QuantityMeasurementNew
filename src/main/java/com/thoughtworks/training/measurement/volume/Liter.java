package com.thoughtworks.training.measurement.volume;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.length.Inch;

public class Liter implements IUnit {
    private double conversionFactor = 1;

    @Override
    public Quantity conversionToBase(double value) {
        return Quantity.createLiter(value * conversionFactor);
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof Liter;

    }

    @Override
    public String toString() {
        return "Liter{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

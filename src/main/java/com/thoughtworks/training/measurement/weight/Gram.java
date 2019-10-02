package com.thoughtworks.training.measurement.weight;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.QuantityFactory;

public class Gram implements IUnit {
    private double conversionFactor = 1;


    @Override
    public Quantity conversionToBase(double value) {
        return QuantityFactory.createGram(value * conversionFactor);
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof Gram;

    }

    @Override
    public String toString() {
        return "Gram{" +
                "conversionFactor=" + conversionFactor +
                '}';
    }
}

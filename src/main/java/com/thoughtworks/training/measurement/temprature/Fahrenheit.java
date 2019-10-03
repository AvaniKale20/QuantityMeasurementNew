package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.QuantityFactory;

public class Fahrenheit implements IUnit {
    @Override
    public Quantity conversionToBase(double value) {
        return QuantityFactory.createCelsius((5.0 * (value - 32)) / 9.0);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Celsius;
    }

    @Override
    public String toString() {
        return "Fahrenheit{}";
    }
}

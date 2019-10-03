package com.thoughtworks.training.measurement.temprature;

import com.thoughtworks.training.measurement.IUnit;
import com.thoughtworks.training.measurement.Quantity;
import com.thoughtworks.training.measurement.QuantityFactory;
import com.thoughtworks.training.measurement.length.Foot;

public class Celsius implements IUnit {

    @Override
    public Quantity conversionToBase(double value) {
        return QuantityFactory.createCelsius(value);
    }

    @Override
    public boolean equals(Object obj) {
        return  obj instanceof Celsius;
    }

    @Override
    public String toString() {
        return "Celsius{}";
    }
}


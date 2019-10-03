package com.thoughtworks.training.measurement;

public class Quantity {
    protected final double value;
    protected final IUnit unit;

    protected Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;

            Quantity typeConvert = unit.conversionToBase(value);
            Quantity typeConvertTwo = that.unit.conversionToBase(that.value);

            return Math.abs(typeConvert.value - typeConvertTwo.value) <= 0.01 && (typeConvert.unit.equals(typeConvertTwo.unit));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

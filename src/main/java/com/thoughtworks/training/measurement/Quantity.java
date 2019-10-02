package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final IUnit unit;


    public Quantity(double value, IUnit unit) {
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


    public Quantity add(Quantity other) throws IllegalArgumentException {
        {
            Quantity thisBase = unit.conversionToBase(value);
            Quantity thatBase = other.unit.conversionToBase(other.value);

            if (!(thisBase.unit.equals(thatBase.unit))) {
                throw new IllegalArgumentException(thisBase.unit + "&" + thatBase.unit + "are not be same");
            }
            return new Quantity(thisBase.value + thatBase.value, thisBase.unit);
        }
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

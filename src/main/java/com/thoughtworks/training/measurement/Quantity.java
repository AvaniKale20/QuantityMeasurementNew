package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
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
            if (this.unit == Unit.INCH && that.unit == Unit.LITER) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == that.unit.conversionToBase(that.value);
        }

        return false;
    }

    public Quantity add(Quantity other) {

//
//        if (this.unit == Unit.INCH) {
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH);
//        }
//        if (this.unit == Unit.LITER) {
//        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.LITER);
//    }
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

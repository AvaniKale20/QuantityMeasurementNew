package com.thoughtworks.training.measurement;

import java.io.IOException;

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

            // If my unit is a length type and other unit is a volume type then return false
            if (unit.lengthUnits().contains(this.unit) && unit.volumeUnits().contains(that.unit)) {
                return false;
            }

            // If my unit is a volume type and other unit is a length type then return false
            if (unit.volumeUnits().contains(this.unit) && unit.lengthUnits().contains(that.unit)) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == (double) Math.round(that.unit.conversionToBase(that.value) * 100) / 100;
        }

        return false;
    }

    public Quantity add(Quantity other) throws IOException {
        if (this.unit == Unit.INCH && other.unit == Unit.LITER || this.unit == Unit.FOOT && other.unit == Unit.GALLON) {
            throw new IOException();
        }
        return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH);
    }

    @Override
    public String toString() {
        return "Quantity{" +
                "value=" + value +
                ", unit=" + unit +
                '}';
    }
}

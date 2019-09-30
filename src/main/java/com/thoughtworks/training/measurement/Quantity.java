package com.thoughtworks.training.measurement;

import java.io.IOException;
import java.util.ArrayList;

public class Quantity {
    private final double value;
    private final Unit unit;

    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    ArrayList<Unit> lengthList = new ArrayList<Unit>();
    ArrayList<Unit> volumeList = new ArrayList<Unit>();

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Quantity) {

            Quantity that = (Quantity) other;

            lengthList.add(Unit.INCH);
            lengthList.add(Unit.FOOT);
            lengthList.add(Unit.YARD);

            volumeList.add(Unit.GALLON);
            volumeList.add(Unit.LITER);

            // If this and that are of different units (in terms of their types) then return false
            // this.unit, that.unit

            if (lengthList.contains(this.unit) && volumeList.contains(that.unit)) {
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

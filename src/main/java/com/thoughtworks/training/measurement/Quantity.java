package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;

public class Quantity {
    private final double value;
    private final IUnit unit;


    public Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;

    }

    static Quantity createFoot(double value) {
        return new Quantity(value, new Foot());
    }

    static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

    static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (other instanceof Quantity) {
            Quantity that = (Quantity) other;
            // If my unit is a length type and other unit is a volume type then return false
            // If my unit is a volume type and other unit is a length type then return false

            if (!this.unit.typeOfUnit().equals(that.unit.typeOfUnit())) {
                return false;
            }
            double thisValue = this.unit.conversionToBase(this.value);
            double thatValue = (double) Math.round(that.unit.conversionToBase(that.value) * 100) / 100;
            return thisValue == thatValue;
        }
        return false;
    }


    public Quantity add(Quantity other) throws IllegalArgumentException {
        {
            if (!this.unit.typeOfUnit().equals(other.unit.typeOfUnit())) {
                throw new IllegalArgumentException(this.unit.typeOfUnit() + "&" + other.unit.typeOfUnit() + "are not be same");
            }
            return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), unit.baseUnit());
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

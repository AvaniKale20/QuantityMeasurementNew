package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;
import com.thoughtworks.training.measurement.weight.Gram;
import com.thoughtworks.training.measurement.weight.KiloGram;

public class Quantity {
    private final double value;
    private final IUnit unit;


    public Quantity(double value, IUnit unit) {
        this.value = value;
        this.unit = unit;

    }

    public static Quantity createFoot(double value) {
        return new Quantity(value, new Foot());
    }

    public static Quantity createInch(double value) {
        return new Quantity(value, new Inch());
    }

    public static Quantity createYard(double value) {
        return new Quantity(value, new Yard());
    }

    public static Quantity createGallon(double value) {
        return new Quantity(value, new Gallon());
    }

    public static Quantity createLiter(double value) {
        return new Quantity(value, new Liter());
    }

    public static Quantity createKilogram(double value) {
        return new Quantity(value, new KiloGram());
    }

    public static Quantity createGram(double value) {
        return new Quantity(value, new Gram());
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

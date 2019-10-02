package com.thoughtworks.training.measurement;

import com.thoughtworks.training.measurement.length.Foot;
import com.thoughtworks.training.measurement.length.Inch;
import com.thoughtworks.training.measurement.length.Yard;
import com.thoughtworks.training.measurement.volume.Gallon;
import com.thoughtworks.training.measurement.volume.Liter;
import com.thoughtworks.training.measurement.weight.Gram;
import com.thoughtworks.training.measurement.weight.KiloGram;

public class QuantityFactory {

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
}

package com.thoughtworks.training.measurement;

import static com.thoughtworks.training.measurement.UnitType.*;

public enum Unit {

    INCH(1, lengthTypeUnit), FOOT(12, lengthTypeUnit), YARD(36, lengthTypeUnit), GALLON(3.78, volumeTypeUnit), LITER(1, volumeTypeUnit);

    private double conversionFactor;
    public UnitType unitType;

    Unit(double conversionFactor, UnitType unitType) {
        this.conversionFactor = conversionFactor;
        this.unitType = unitType;
    }

    public Unit baseConverter() {
        if (this == LITER || this == GALLON) {
            return LITER;
        }
        return INCH;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
}

package com.thoughtworks.training.measurement;


import static com.thoughtworks.training.measurement.UnitType.*;

public enum Unit {

    INCH(1, lengthTypeUnit),
    FOOT(12, lengthTypeUnit, INCH),
    YARD(36, lengthTypeUnit, INCH),
    LITER(1, volumeTypeUnit),
    GALLON(3.78, volumeTypeUnit, LITER),
    CM(3, lengthTypeUnit, INCH);

    final private double conversionFactor;
    final public UnitType unitType;
    final public Unit baseUnit;

    Unit(double conversionFactor, UnitType unitType) {
        this.conversionFactor = conversionFactor;
        this.unitType = unitType;
        this.baseUnit = this;
    }

    Unit(double conversionFactor, UnitType unitType, Unit baseUnit) {
        this.conversionFactor = conversionFactor;
        this.unitType = unitType;
        this.baseUnit = baseUnit;
    }

    public Unit baseConverter() {
        return baseUnit;
    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }

    public static void main(String[] args) {
        System.out.println("base unit for foot=" + FOOT.baseUnit);
        System.out.println("base unit for Inch=" + INCH.baseUnit);
    }
}

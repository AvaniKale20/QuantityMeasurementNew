package com.thoughtworks.training.measurement;

import java.util.ArrayList;

public enum Unit {

    INCH(1, "LengthType"), CM(1, "LengthType"), FOOT(12, "LengthType"), YARD(36, "LengthType"), GALLON(3.78, "VolumeType"), LITER(1, "VolumeType");

    private double conversionFactor;
    public String unitType;


    ArrayList<Unit> lengthUnits() {

        ArrayList<Unit> units = new ArrayList<>();
        //iteration
        for (Unit unit : Unit.values()) {
            if (unit.unitType.equals("LengthType")) {
                units.add(unit);
            }
        }
        return units;
    }

    ArrayList<Unit> volumeUnits() {

        ArrayList<Unit> units = new ArrayList<>();
        for (Unit unit : Unit.values()) {
            if (unit.unitType.equals("VolumeType")) {
                units.add(unit);
            }
        }
        return units;
    }


    Unit(double conversionFactor, String unitType) {
        this.conversionFactor = conversionFactor;
        this.unitType = unitType;


    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
}

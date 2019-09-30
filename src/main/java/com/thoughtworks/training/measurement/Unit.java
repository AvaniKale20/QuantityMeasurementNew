package com.thoughtworks.training.measurement;

import java.util.ArrayList;

public enum Unit {

    INCH(1,"LengthType"), FOOT(12,"LengthType"), YARD(36,"LengthType"), GALLON(3.78,"VolumeType"), LITER(1,"VolumeType");

    private double conversionFactor;
    private String unitType;

    ArrayList<Unit> lengthList = new ArrayList<>();

    ArrayList<Unit> volumeList = new ArrayList<>();

    ArrayList<Unit> lengthType() {
        lengthList.add(Unit.INCH);
        lengthList.add(Unit.FOOT);
        lengthList.add(Unit.YARD);
        return lengthList;
    }

    ArrayList<Unit> volumeType() {
        volumeList.add(Unit.GALLON);
        volumeList.add(Unit.LITER);

        return volumeList;
    }

    Unit(double conversionFactor,String unitType) {
        this.conversionFactor = conversionFactor;
        this.unitType=unitType;


    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
    }

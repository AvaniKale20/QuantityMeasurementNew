package com.thoughtworks.training.measurement;

import java.util.ArrayList;

public enum Unit {

    INCH(1), FOOT(12), YARD(36), GALLON(3.78), LITER(1);

    private double conversionFactor;

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

    Unit(double conversionFactor) {
        this.conversionFactor = conversionFactor;


    }

    double conversionToBase(double value) {
        return value * conversionFactor;
    }
    }

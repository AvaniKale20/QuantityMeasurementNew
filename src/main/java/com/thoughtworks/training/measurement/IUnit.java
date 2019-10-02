package com.thoughtworks.training.measurement;

public interface IUnit {
    double conversionToBase(double value);

    IUnit baseUnit();

    UnitType typeOfUnit();
}

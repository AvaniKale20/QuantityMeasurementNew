package com.thoughtworks.training.measurement;

public class Quantity {
    private final double value;
    public final Unit unit;


    public Quantity(double value, Unit unit) {
        this.value = value;
        this.unit = unit;

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
            if (!this.unit.unitType.equals(that.unit.unitType)) {
                return false;
            }
            return this.unit.conversionToBase(this.value) == (double) Math.round(that.unit.conversionToBase(that.value) * 100) / 100;
        }
        return false;
    }



    public Quantity add(Quantity other) throws IllegalArgumentException {
        {
            if (!this.unit.unitType.equals(other.unit.unitType)) {
                throw new IllegalArgumentException(this.unit.unitType + "&" + other.unit.unitType + "are not be same"); // TODO - But not this exception. No message in the exception... assert the message as well
            }
            return new Quantity(this.unit.conversionToBase(this.value) + other.unit.conversionToBase(other.value), Unit.INCH); // TODO - generalize.
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

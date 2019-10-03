package com.thoughtworks.training.measurement;

public class AddableQuantity extends Quantity {

    protected AddableQuantity(double value, IUnit unit) {
        super(value, unit);
    }

    public AddableQuantity add(AddableQuantity other) throws IllegalArgumentException {
        {
            AddableQuantity thisBase = (AddableQuantity) unit.conversionToBase(value);
            AddableQuantity thatBase = (AddableQuantity) other.unit.conversionToBase(other.value);

            if (!(thisBase.unit.equals(thatBase.unit))) {
                throw new IllegalArgumentException(thisBase.unit + "&" + thatBase.unit + "are not be same");
            }
            return new AddableQuantity(thisBase.value + thatBase.value, thisBase.unit);
        }
    }

    @Override
    public boolean equals(Object other) {
        return super.equals(other);
    }
}

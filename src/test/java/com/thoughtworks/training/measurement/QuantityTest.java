package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InvalidClassException;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);
        Quantity anotherZeroFoot = new Quantity(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = new Quantity(2, Unit.FOOT);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity otherFoot = new Quantity(1.0, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0, Unit.INCH);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneInchAndOneInch_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = new Quantity(1, Unit.FOOT);
        Quantity otherFoot = new Quantity(1, Unit.FOOT);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = new Quantity(2, Unit.INCH);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = new Quantity(1, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = new Quantity(0, Unit.INCH);
        Quantity zeroFoot = new Quantity(0, Unit.FOOT);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenOneInchThreeFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwoFeetAndTwentyFourInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = new Quantity(24, Unit.INCH);
        Quantity twoFeet = new Quantity(2, Unit.FOOT);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenOneFeetAndTwelveInch_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = new Quantity(12, Unit.INCH);
        Quantity oneFoot = new Quantity(1, Unit.FOOT);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = new Quantity(0, Unit.YARD);
        Quantity anotherZeroYard = new Quantity(0, Unit.YARD);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity anotherOneYard = new Quantity(1, Unit.YARD);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = new Quantity(1, Unit.YARD);
        Quantity seventyTwoInches = new Quantity(3, Unit.FOOT);

        assertTrue(oneYard.equals(seventyTwoInches));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IOException {
        Quantity zeroInch = new Quantity(0.0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0.0, Unit.INCH);

        assertEquals(new Quantity(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IOException {
        Quantity twoInch = new Quantity(2.0, Unit.INCH);
        Quantity anotherTwoInch = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() throws IOException {
        Quantity OneFeet = new Quantity(1.0, Unit.FOOT);
        Quantity TwoInches = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(14.0, Unit.INCH), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() throws IOException {
        Quantity twoInches = new Quantity(2.0, Unit.INCH);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertEquals(new Quantity(14.0, Unit.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() throws IOException {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneFoot1 = new Quantity(1.0, Unit.FOOT);

        assertEquals(new Quantity(2.0, Unit.FOOT), oneFoot.add(oneFoot1));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity anotherOneGallon = new Quantity(1.0, Unit.GALLON);

        assertTrue(oneGallon.equals(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WheEqual_ThenShouldBeEqual() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity anotherOneLiter = new Quantity(1.0, Unit.LITER);

        assertTrue(oneLiter.equals(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertFalse(oneLiter.equals(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertFalse(oneGallon.equals(oneLiter));
    }


    //Checking Equal or Not For(Length to Volume)
    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneFootAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);


        assertNotEquals(oneFoot, oneLiter);
    }


    @Test
    void givenOneInchAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneFootAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertNotEquals(oneFoot, oneGallon);
    }

    //Checking Equal or Not For(volume to Length)
    @Test
    void givenOneGallonAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertNotEquals(oneGallon, oneFoot);
    }

    @Test
    void givenOneGallonAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        assertNotEquals(oneGallon, oneInch);
    }

    @Test
    void givenOneLiterAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertNotEquals(oneLiter, oneFoot);
    }

    @Test
    void givenOneLiterAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        assertNotEquals(oneLiter, oneInch);
    }

    ///Exception
    @Test
    void givenOneInchAndOneGallon_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity OneLiter = new Quantity(1.0, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(OneLiter);
        }, oneInch.unit.unitType + "&" + OneLiter.unit.unitType + "are not be same");
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        }, oneFoot.unit.unitType + "&" + oneGallon.unit.unitType + "are not be same");
    }

    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneInch = new Quantity(1.0, Unit.INCH);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        }, oneInch.unit.unitType + "&" + oneLiter.unit.unitType + "are not be same");
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        }, oneFoot.unit.unitType + "&" + oneLiter.unit.unitType + "are not be same");
    }

    @Test
    void givenOneGallonAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        }, oneGallon.unit.unitType + "&" + oneFoot.unit.unitType + "are not be same");
    }

    @Test
    void givenOneLiterAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);


        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        }, oneLiter.unit.unitType + "&" + oneFoot.unit.unitType + "are not be same");

    }

    @Test
    void givenOneLiterAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        }, oneLiter.unit.unitType + "&" + oneInch.unit.unitType + "are not be same");
    }

    @Test
    void givenOneGallonAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneInch = new Quantity(1.0, Unit.INCH);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        }, oneGallon.unit.unitType + "&" + oneInch.unit.unitType + "are not be same");
    }

    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity anotherOneGallon = new Quantity(1.0, Unit.GALLON);

        assertEquals(new Quantity(2.0, Unit.GALLON), oneGallon.add(anotherOneGallon));
    }


}


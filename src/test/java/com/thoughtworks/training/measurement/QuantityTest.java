package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = Quantity.createFoot(0);
        Quantity anotherZeroFoot = Quantity.createFoot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = Quantity.createFoot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity twoFoot = Quantity.createFoot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity otherFoot = Quantity.createFoot(1.0);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity anotherZeroInch = Quantity.createInch(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneFootAndOtherFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = Quantity.createFoot(1);
        Quantity otherFoot = Quantity.createFoot(1);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = Quantity.createInch(1);
        Quantity twoInch = Quantity.createInch(2);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = Quantity.createInch(1);
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = Quantity.createInch(1);
        Quantity oneFoot = Quantity.createFoot(1);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = Quantity.createInch(0);
        Quantity zeroFoot = Quantity.createFoot(0);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenTweleveInchAndOneFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = Quantity.createInch(12);
        Quantity oneFoot = Quantity.createFoot(1);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwentyFourInchAndTwoFeet_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = Quantity.createInch(24);
        Quantity twoFeet = Quantity.createFoot(2);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenTwelveInchAndOneFeet_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = Quantity.createInch(12);
        Quantity oneFoot = Quantity.createFoot(1);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = Quantity.createYard(0);
        Quantity anotherZeroYard = Quantity.createYard(0);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity anotherOneYard = Quantity.createYard(1);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = Quantity.createYard(1);
        Quantity seventyTwoInches = Quantity.createFoot(3);

        assertTrue(oneYard.equals(seventyTwoInches));
    }

    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        Quantity zeroInch = Quantity.createInch(0.0);
        Quantity anotherZeroInch = Quantity.createInch(0.0);

        assertEquals(Quantity.createInch(0.0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        Quantity twoInch = Quantity.createInch(2.0);
        Quantity anotherTwoInch = Quantity.createInch(2.0);

        assertEquals(Quantity.createInch(4.0), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        Quantity OneFeet = Quantity.createFoot(1.0);
        Quantity TwoInches = Quantity.createInch(2.0);

        assertEquals(Quantity.createInch(14.0), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        Quantity twoInches = Quantity.createInch(2.0);
        Quantity oneFoot = Quantity.createFoot(1.0);

        assertEquals(Quantity.createInch(14.0), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() throws IllegalArgumentException {
        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity oneFoot1 = Quantity.createFoot(1.0);

        assertEquals(Quantity.createFoot(2.0), oneFoot.add(oneFoot1));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity anotherOneGallon = Quantity.createGallon(1.0);

        assertTrue(oneGallon.equals(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WheEqual_ThenShouldBeEqual() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity anotherOneLiter = Quantity.createLiter(1.0);

        assertTrue(oneLiter.equals(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneGallon = Quantity.createGallon(1.0);

        assertFalse(oneLiter.equals(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);

        assertFalse(oneGallon.equals(oneLiter));
    }


    //Checking Equal or Not For(Length to Volume)
    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneFootAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);


        assertNotEquals(oneFoot, oneLiter);
    }


    @Test
    void givenOneInchAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity oneGallon = Quantity.createGallon(1.0);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneFootAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity oneGallon = Quantity.createGallon(1.0);

        assertNotEquals(oneFoot, oneGallon);
    }

    //Checking Equal or Not For(volume to Length)
    @Test
    void givenOneGallonAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneFoot = Quantity.createFoot(1.0);

        assertNotEquals(oneGallon, oneFoot);
    }

    @Test
    void givenOneGallonAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneInch = Quantity.createInch(1.0);

        assertNotEquals(oneGallon, oneInch);
    }

    @Test
    void givenOneLiterAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneFoot = Quantity.createFoot(1.0);

        assertNotEquals(oneLiter, oneFoot);
    }

    @Test
    void givenOneLiterAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneInch = Quantity.createInch(1.0);

        assertNotEquals(oneLiter, oneInch);
    }

    ///Exception
    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity OneLiter = Quantity.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(OneLiter);
        }, "INCH " + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity oneGallon = Quantity.createGallon(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        }, "FOOT" + "&" + "GALLON" + "are not be same");
    }

    @Test
    void givenOneInchAnOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneInch = Quantity.createInch(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        }, "INCH" + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        Quantity oneFoot = Quantity.createFoot(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        }, "FOOT" + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneGallonAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneFoot = Quantity.createFoot(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        }, "GALLON" + "&" + "FOOT" + "are not be same");
    }

    @Test
    void givenOneLiterAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneFoot = Quantity.createFoot(1.0);


        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        }, "LITER" + "&" + "FOOT" + "are not be same");


    }

    @Test
    void givenOneLiterAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneInch = Quantity.createInch(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        }, "LITER" + "&" + "INCH" + "are not be same");
    }

    @Test
    void givenOneGallonAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneInch = Quantity.createInch(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        }, "GALLON" + "&" + "INCH" + "are not be same");
    }

    //Adding Two unit type
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity anotherOneGallon = Quantity.createGallon(1.0);

        assertEquals(Quantity.createGallon(2.0), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() throws IllegalArgumentException {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity anotherOneLiter = Quantity.createLiter(1.0);

        assertEquals(Quantity.createLiter(2.0), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeReturnFourPointSevenEight() throws IllegalArgumentException {
        Quantity oneGallon = Quantity.createGallon(1.0);
        Quantity oneLiter = Quantity.createLiter(1.0);

        assertEquals(Quantity.createLiter(4.78), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() throws IllegalArgumentException {
        Quantity oneLiter = Quantity.createLiter(1.0);
        Quantity oneGallon = Quantity.createGallon(1.0);


        assertEquals(Quantity.createLiter(4.78), oneLiter.add(oneGallon));
    }

    //Add kg - gram
    @Test
    void givenOneKiloGramAndAnotherOneKiloGram_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneKilogram = Quantity.createKilogram(1.0);
        Quantity oneKilogram1 = Quantity.createKilogram(1.0);

        assertTrue(oneKilogram.equals(oneKilogram1));
    }

    @Test
    void givenOneKilogramAndOneKilogram_WhenAdd_ThenShouldBeReturnTwoKilogram() throws IllegalArgumentException {
        Quantity oneKilogram = Quantity.createKilogram(1.0);
        Quantity oneKilogram1 = Quantity.createKilogram(1.0);

        assertEquals(Quantity.createKilogram(2.0), oneKilogram.add(oneKilogram1));
    }

    @Test
    void givenOneKilogramAndTwoKilogram_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneKilogram = Quantity.createKilogram(1);
        Quantity twoKilogram = Quantity.createKilogram(2);

        assertFalse(oneKilogram.equals(twoKilogram));
    }

}


package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityTest {

    @Test
    void givenZeroFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity zeroFoot = QuantityFactory.createFoot(0);
        Quantity anotherZeroFoot = QuantityFactory.createFoot(0);

        assertTrue(zeroFoot.equals(anotherZeroFoot));
    }

    @Test
    void givenZeroFootAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {

        Quantity zeroFoot = QuantityFactory.createFoot(0);

        assertFalse(zeroFoot.equals(new Object()));
    }

    @Test
    void givenOneFootAndTwoFoot_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity twoFoot = QuantityFactory.createFoot(2);

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity otherFoot = QuantityFactory.createFoot(1.0);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneFootAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity twoFoot = null;

        assertFalse(oneFoot.equals(twoFoot));
    }

    @Test
    void givenZeroInch_WhenCompare_ThenShouldBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);
        Quantity anotherZeroInch = QuantityFactory.createInch(0);

        assertTrue(zeroInch.equals(anotherZeroInch));
    }

    @Test
    void givenZeroInchAndAnotherObject_WhenEquals_ThenShouldNotBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);

        assertFalse(zeroInch.equals(new Object()));
    }

    @Test
    void givenOneFootAndOtherFoot_WhenEquals_ThenShouldBeEqual() {

        Quantity oneFoot = QuantityFactory.createFoot(1);
        Quantity otherFoot = QuantityFactory.createFoot(1);

        assertTrue(oneFoot.equals(otherFoot));
    }

    @Test
    void givenOneInchAndTwoInch_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity twoInch = QuantityFactory.createInch(2);

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchAndNull_WhenEquals_ThenShouldNotBeEqual() {

        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity twoInch = null;

        assertFalse(oneInch.equals(twoInch));
    }

    @Test
    void givenOneInchOneFoot_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneInch = QuantityFactory.createInch(1);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertFalse(oneFoot.equals(oneInch));
    }

    @Test
    void givenZeroInchZeroFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroInch = QuantityFactory.createInch(0);
        Quantity zeroFoot = QuantityFactory.createFoot(0);

        assertTrue(zeroFoot.equals(zeroInch));
    }

    @Test
    void givenTweleveInchAndOneFoot_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = QuantityFactory.createInch(12);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertTrue(oneFoot.equals(twelveInch));
    }

    @Test
    void givenTwentyFourInchAndTwoFeet_WhenEquals_ThenShouldBeEqual() {
        Quantity twentyFourInch = QuantityFactory.createInch(24);
        Quantity twoFeet = QuantityFactory.createFoot(2);

        assertTrue(twoFeet.equals(twentyFourInch));
    }

    @Test
    void givenTwelveInchAndOneFeet_WhenEquals_ThenShouldBeEqual() {
        Quantity twelveInch = QuantityFactory.createInch(12);
        Quantity oneFoot = QuantityFactory.createFoot(1);

        assertTrue(twelveInch.equals(oneFoot));
    }

    @Test
    void givenZeroYardAndZeroYard_WhenEquals_ThenShouldBeEqual() {
        Quantity zeroYard = QuantityFactory.createYard(0);
        Quantity anotherZeroYard = QuantityFactory.createYard(0);

        assertTrue(zeroYard.equals(anotherZeroYard));
    }

    @Test
    void givenOneYardAndOneYard_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = QuantityFactory.createYard(1);
        Quantity anotherOneYard = QuantityFactory.createYard(1);

        assertTrue(oneYard.equals(anotherOneYard));
    }

    @Test
    void givenTwoYardAndSeventyTwoInches_WhenEquals_ThenShouldBeEqual() {
        Quantity oneYard = QuantityFactory.createYard(1);
        Quantity seventyTwoInches = QuantityFactory.createFoot(3);

        assertTrue(oneYard.equals(seventyTwoInches));
    }

    /*
    Next Requirement is 1 gallon = 3.78liters
    1 gallon + 1Liter= 4.78
     */
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity anotherOneGallon = QuantityFactory.createGallon(1.0);

        assertTrue(oneGallon.equals(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WheEqual_ThenShouldBeEqual() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity anotherOneLiter = QuantityFactory.createLiter(1.0);

        assertTrue(oneLiter.equals(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity oneGallon = QuantityFactory.createGallon(1.0);

        assertFalse(oneLiter.equals(oneGallon));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenEqual_ThenShouldNotBeEqual() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);

        assertFalse(oneGallon.equals(oneLiter));
    }


    //Checking Equal or Not For(Length to Volume)
    @Test
    void givenOneInchAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = QuantityFactory.createInch(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);

        assertNotEquals(oneInch, oneLiter);
    }

    @Test
    void givenOneFootAndOneLiter_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity oneLiter = QuantityFactory.createLiter(1.0);


        assertNotEquals(oneFoot, oneLiter);
    }


    @Test
    void givenOneInchAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneInch = QuantityFactory.createInch(1.0);
        Quantity oneGallon = QuantityFactory.createGallon(1.0);

        assertNotEquals(oneInch, oneGallon);
    }

    @Test
    void givenOneFootAndOneGallon_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneFoot = QuantityFactory.createFoot(1.0);
        Quantity oneGallon = QuantityFactory.createGallon(1.0);

        assertNotEquals(oneFoot, oneGallon);
    }

    //Checking Equal or Not For(volume to Length)
    @Test
    void givenOneGallonAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity oneFoot = QuantityFactory.createFoot(1.0);

        assertNotEquals(oneGallon, oneFoot);
    }

    @Test
    void givenOneGallonAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneGallon = QuantityFactory.createGallon(1.0);
        Quantity oneInch = QuantityFactory.createInch(1.0);

        assertNotEquals(oneGallon, oneInch);
    }

    @Test
    void givenOneLiterAndOneFoot_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity oneFoot = QuantityFactory.createFoot(1.0);

        assertNotEquals(oneLiter, oneFoot);
    }

    @Test
    void givenOneLiterAndOneInch_WhenEquals_ThenShouldBeNotEquals() {
        Quantity oneLiter = QuantityFactory.createLiter(1.0);
        Quantity oneInch = QuantityFactory.createInch(1.0);

        assertNotEquals(oneLiter, oneInch);
    }


    //Add kg - gram
    @Test
    void givenOneKiloGramAndAnotherOneKiloGram_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneKilogram = QuantityFactory.createKilogram(1.0);
        Quantity oneKilogram1 = QuantityFactory.createKilogram(1.0);

        assertTrue(oneKilogram.equals(oneKilogram1));
    }

    @Test
    void givenOneKilogramAndOneKilogram_WhenAdd_ThenShouldBeReturnTwoKilogram() throws IllegalArgumentException {
        AddableQuantity oneKilogram = QuantityFactory.createKilogram(1.0);
        AddableQuantity oneKilogram1 = QuantityFactory.createKilogram(1.0);

        assertEquals(QuantityFactory.createKilogram(2.0), oneKilogram.add(oneKilogram1));
    }

    @Test
    void givenOneKilogramAndTwoKilogram_WhenEquals_ThenShouldNotBeEqual() {
        Quantity oneKilogram = QuantityFactory.createKilogram(1);
        Quantity twoKilogram = QuantityFactory.createKilogram(2);

        assertFalse(oneKilogram.equals(twoKilogram));
    }

    @Test
    void givenOneGramAndAnotherOneGram_WhenEqual_ThenShouldBeReturnEqual() {
        Quantity oneGram = QuantityFactory.createGram(1.0);
        Quantity oneGram1 = QuantityFactory.createGram(1.0);

        assertTrue(oneGram.equals(oneGram1));
    }

    @Test
    void givenOneGramAndTwoGram_WhenCheckEquals_ThenShouldNotBeEqual() {
        Quantity oneGram = QuantityFactory.createKilogram(1);
        Quantity twoGram = QuantityFactory.createKilogram(2);

        assertFalse(oneGram.equals(twoGram));
    }

    @Nested
    public class CelsiusAndFahrenheit {

        @Test
        void givenZeroFahrenheitAndAndZeroCelsius_WhenEqual_ThenShouldNotBeEqual() {
            Quantity zeroFahrenheit = QuantityFactory.createFahrenheit(0);
            Quantity zeroCelsius = QuantityFactory.createCelsius(0);

            assertNotEquals(zeroFahrenheit, zeroCelsius);
        }

        @Test
        void givenZeroCelsiusAndThirtyTwoFahrenhite_WhenEqual_ThenShouldBeEqual() {
            Quantity zeroFahrenheit = QuantityFactory.createFahrenheit(32);
            Quantity zeroCelsius = QuantityFactory.createCelsius(0);

            assertEquals(zeroFahrenheit, zeroCelsius);
        }

    }
}


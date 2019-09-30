package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

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
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity zeroInch = new Quantity(0.0, Unit.INCH);
        Quantity anotherZeroInch = new Quantity(0.0, Unit.INCH);

        assertEquals(new Quantity(0.0, Unit.INCH), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInch = new Quantity(2.0, Unit.INCH);
        Quantity anotherTwoInch = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(4.0, Unit.INCH), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() {
        Quantity OneFeet = new Quantity(1.0, Unit.FOOT);
        Quantity TwoInches = new Quantity(2.0, Unit.INCH);

        assertEquals(new Quantity(14.0, Unit.INCH), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() {
        Quantity twoInches = new Quantity(2.0, Unit.INCH);
        Quantity oneFoot = new Quantity(1.0, Unit.FOOT);

        assertEquals(new Quantity(14.0, Unit.INCH), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() {
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
    void givenoneGallonAndOoneLiter_WhenAdd_ThenShouldBeReturn() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertFalse(oneGallon.equals(oneLiter));
    }

    @Test
    void givenoneGallonAndanotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity anotherOneGallon = new Quantity(1.0, Unit.GALLON);

        assertEquals(new Quantity(2.0, Unit.GALLON), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() {
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);
        Quantity anotherOneLiter = new Quantity(1.0, Unit.LITER);

        assertEquals(new Quantity(2.0, Unit.LITER), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() {
        Quantity oneGallon = new Quantity(1.0, Unit.GALLON);
        Quantity oneLiter = new Quantity(1.0, Unit.LITER);

        assertEquals(new Quantity(4.78, Unit.LITER), oneGallon.add(oneLiter));
    }

}

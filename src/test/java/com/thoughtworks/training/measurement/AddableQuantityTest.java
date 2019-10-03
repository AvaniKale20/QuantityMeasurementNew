package com.thoughtworks.training.measurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AddableQuantityTest {
    @Test
    void givenZeroInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        AddableQuantity zeroInch = QuantityFactory.createInch(0.0);
        AddableQuantity anotherZeroInch = QuantityFactory.createInch(0.0);

        assertEquals(QuantityFactory.createInch(0.0), zeroInch.add(anotherZeroInch));
    }

    @Test
    void givenTwoInchAndZeroInch_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        AddableQuantity twoInch = QuantityFactory.createInch(2.0);
        AddableQuantity anotherTwoInch = QuantityFactory.createInch(2.0);

        assertEquals(QuantityFactory.createInch(4.0), twoInch.add(anotherTwoInch));
    }

    @Test
    void givenOneFeetAndTwoInches_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        AddableQuantity OneFeet = QuantityFactory.createFoot(1.0);
        AddableQuantity TwoInches = QuantityFactory.createInch(2.0);

        assertEquals(QuantityFactory.createInch(14.0), OneFeet.add(TwoInches));
    }

    @Test
    void givenTwoInchesAndOneFoott_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        AddableQuantity twoInches = QuantityFactory.createInch(2.0);
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);

        assertEquals(QuantityFactory.createInch(14.0), twoInches.add(oneFoot));
    }

    @Test
    void givenOneFootAndOneFoot_WhenAdd_ThenShouldBeReturnTwoFoot() throws IllegalArgumentException {
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);
        AddableQuantity oneFoot1 = QuantityFactory.createFoot(1.0);

        assertEquals(QuantityFactory.createFoot(2.0), oneFoot.add(oneFoot1));
    }

    ///Exception
    @Test
    void givenOneInchAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneInch = QuantityFactory.createInch(1.0);
        AddableQuantity OneLiter = QuantityFactory.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(OneLiter);
        }, "INCH " + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneFootAndOneGallon_WhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneGallon);
        }, "FOOT" + "&" + "GALLON" + "are not be same");
    }

    @Test
    void givenOneInchAnOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneInch = QuantityFactory.createInch(1.0);
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneInch.add(oneLiter);
        }, "INCH" + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneFootAndOneLiter_WhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneFoot.add(oneLiter);
        }, "FOOT" + "&" + "LITER" + "are not be same");
    }

    @Test
    void givenOneGallonAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneFoot);
        }, "GALLON" + "&" + "FOOT" + "are not be same");
    }

    @Test
    void givenOneLiterAndOneFootWhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);
        AddableQuantity oneFoot = QuantityFactory.createFoot(1.0);


        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneFoot);
        }, "LITER" + "&" + "FOOT" + "are not be same");


    }

    @Test
    void givenOneLiterAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);
        AddableQuantity oneInch = QuantityFactory.createInch(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneLiter.add(oneInch);
        }, "LITER" + "&" + "INCH" + "are not be same");
    }

    @Test
    void givenOneGallonAndOneInchWhenAdd_ThenShouldNotBeAdded() {
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);
        AddableQuantity oneInch = QuantityFactory.createInch(1.0);

        assertThrows(IllegalArgumentException.class, () -> {
            oneGallon.add(oneInch);
        }, "GALLON" + "&" + "INCH" + "are not be same");
    }

    //Adding Two unit type
    @Test
    void givenOneGallonAndAnotherOneGallon_WhenAdd_ThenShouldBeReturnOneGallon() {
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);
        AddableQuantity anotherOneGallon = QuantityFactory.createGallon(1.0);

        assertEquals(QuantityFactory.createGallon(2.0), oneGallon.add(anotherOneGallon));
    }

    @Test
    void givenOneLiterAndAnotherOneLiter_WhenAdd_ThenShouldBeReturnOneLiter() throws IllegalArgumentException {
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);
        AddableQuantity anotherOneLiter = QuantityFactory.createLiter(1.0);

        assertEquals(QuantityFactory.createLiter(2.0), oneLiter.add(anotherOneLiter));
    }

    @Test
    void givenOneGallonAndOneLiter_WhenAdd_ThenShouldBeReturnFourPointSevenEight() throws IllegalArgumentException {
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);

        assertEquals(QuantityFactory.createLiter(4.78), oneGallon.add(oneLiter));
    }

    @Test
    void givenOneLiterAndOneGallon_WhenAdd_ThenShouldBeReturnFourPointSevenEight() throws IllegalArgumentException {
        AddableQuantity oneLiter = QuantityFactory.createLiter(1.0);
        AddableQuantity oneGallon = QuantityFactory.createGallon(1.0);


        assertEquals(QuantityFactory.createLiter(4.78), oneLiter.add(oneGallon));
    }
    @Test
    void givenOneGramAndOneGram_WhenAdd_ThenShouldBeReturnTwoGram() throws IllegalArgumentException {
        AddableQuantity oneGram = QuantityFactory.createGram(1.0);
        AddableQuantity oneGram1 = QuantityFactory.createGram(1.0);

        assertEquals(QuantityFactory.createGram(2.0), oneGram.add(oneGram1));
    }
    @Test
    void givenOneGramAndOneKilogram_WhenAdd_ThenShouldBeReturnFourPointSevenEight() throws IllegalArgumentException {
        AddableQuantity oneGram = QuantityFactory.createGram(1.0);
        AddableQuantity oneKilogram = QuantityFactory.createKilogram(1.0);

        assertEquals(QuantityFactory.createGram(1001), oneGram.add(oneKilogram));
    }

    @Test
    void givenOneGramAndOneKilogram_WhenAdd_ThenShouldBeFourInches() throws IllegalArgumentException {
        AddableQuantity twoGram = QuantityFactory.createGram(2.0);
        AddableQuantity oneKilogram = QuantityFactory.createKilogram(1.0);

        assertEquals(QuantityFactory.createGram(1002), twoGram.add(oneKilogram));
    }

}


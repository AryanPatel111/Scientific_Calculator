package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testCalculateSquareRoot() {
        assertEquals(2.0, Main.calculateSquareRoot(4), 0.001);
        assertEquals(3.0, Main.calculateSquareRoot(9), 0.001);
        assertEquals(4.0, Main.calculateSquareRoot(16), 0.001);
        assertEquals(5.0, Main.calculateSquareRoot(25), 0.001);

    }

    @Test
    public void testCalculateFactorial() {
        assertEquals(2, Main.calculateFactorial(2));
        assertEquals(6, Main.calculateFactorial(3));
        assertEquals(120, Main.calculateFactorial(5));
        assertEquals(1, Main.calculateFactorial(0));
    }

    @Test
    public void testCalculateNaturalLogarithm() {
        assertEquals(1.099, Main.calculateNaturalLogarithm(3), 0.001);
        assertEquals(1.386, Main.calculateNaturalLogarithm(4), 0.001);
        assertEquals(0.0, Main.calculateNaturalLogarithm(1), 0.001);
        assertEquals(1.609, Main.calculateNaturalLogarithm(5), 0.001);
    }

    @Test
    public void testCalculatePowerFunction() {
        assertEquals(16.0, Main.calculatePowerFunction(2, 4), 0.001);
        assertEquals(32.0, Main.calculatePowerFunction(2, 5), 0.001);
        assertEquals(9, Main.calculatePowerFunction(3, 2), 0.001);
        assertEquals(27, Main.calculatePowerFunction(3, 3), 0.001);
    }
}
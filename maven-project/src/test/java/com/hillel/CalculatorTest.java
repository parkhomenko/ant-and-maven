package com.hillel;

import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    public void testAddition() {
        int result = calculator.addition(3, 5);
        assertEquals(result, 8);
    }
}

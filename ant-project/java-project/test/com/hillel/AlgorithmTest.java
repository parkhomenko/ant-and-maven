package com.hillel;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlgorithmTest {

    Algorithm algorithm;

    @Before
    public void setUp() {
        algorithm = new Algorithm();
    }

    @Test
    public void testTheAlgorithmCorrect() {
        int[] array = {1, 3, 11, 12, 35};
        int numberToFind = 23;

        boolean result =  algorithm.numbersExist(array, numberToFind);

        assertTrue(result);
    }

    @Test
    public void testTheAlgorithmIncorrect() {
        int[] array = {1, 3, 11, 13, 35};
        int numberToFind = 23;

        boolean result =  algorithm.numbersExist(array, numberToFind);

        assertFalse(result);
    }
}
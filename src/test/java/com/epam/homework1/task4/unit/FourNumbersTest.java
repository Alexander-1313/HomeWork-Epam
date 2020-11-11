package com.epam.homework1.task4.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class FourNumbersTest {

    @Test
    public void testIsEven() {

        boolean actual = FourNumbers.isEven(12, 45, 21, 98);

        assertTrue(actual);
    }
}
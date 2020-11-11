package com.epam.homework1.task1.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberServiceTest {

    @Test
    public void testLastDigitOfSqrNumber() {

        Number actual = NumberService.lastDigitOfSqrNumber(19);
        Number expected = 1;

        assertEquals(actual, expected, "Test should return right last digit of sqr number for integer value");
    }

    @Test
    public void testTestLastDigitOfSqrNumber() {

        Number actual = NumberService.lastDigitOfSqrNumber(19.6);
        Number expected = 6;

        assertEquals(actual, expected, "Test should return right last digit of sqr number for double value");
    }
}
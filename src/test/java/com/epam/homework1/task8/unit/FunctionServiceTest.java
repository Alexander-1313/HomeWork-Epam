package com.epam.homework1.task8.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FunctionServiceTest {

    @Test
    public void testF() {

        double actual = FunctionService.F(3);
        double expected = 9;

        assertEquals(actual, expected, 0.0001);
    }
}
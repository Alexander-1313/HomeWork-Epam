package com.epam.homework1.task9.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadiusServiceTest {

    @Test
    public void testCalculateSquareAndCircumference() {

        double[] actual = RadiusService.calculateSquareAndCircumference(6);
        double[] expected = {113.04, 37.68};

        assertEquals(actual, expected, 0.1);
    }
}
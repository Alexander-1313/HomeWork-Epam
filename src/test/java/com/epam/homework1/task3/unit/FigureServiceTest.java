package com.epam.homework1.task3.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FigureServiceTest {

    @Test
    public void testAreaOfSquareInCircle() {

        double actual = FigureService.areaOfSquareInCircle(49);
        double expected = 24.5;

        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testCalculateRadiusOfCircleByAreaOfOutSquare() {

        double actual = FigureService.calculateRadiusOfCircleByAreaOfOutSquare(49);
        double expected = 3.5;

        assertEquals(actual, expected, 0.0001);
    }

    @Test
    public void testHowManyTimesInSquareLessThenOutSquare() {

        double actual = FigureService.howManyTimesInSquareLessThenOutSquare(5, 10);
        double expected = 0.5;

        assertEquals(actual, expected, 0.0001);

    }
}
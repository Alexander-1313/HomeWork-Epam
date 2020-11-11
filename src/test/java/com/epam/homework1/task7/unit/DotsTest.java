package com.epam.homework1.task7.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DotsTest {

    @Test
    public void testClosestPoint() {

        String actual = Dots.closestPoint(1, 1, 2, 2);
        String expected = "A";

        Assert.assertEquals(actual, expected);
    }
}
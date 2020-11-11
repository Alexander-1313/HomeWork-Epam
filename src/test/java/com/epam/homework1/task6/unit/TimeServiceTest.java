package com.epam.homework1.task6.unit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeServiceTest {

    @Test
    public void testCalculateTime() {

        long[] actual = TimeService.calculateTime(3667L);
        long[] expected = {1, 1, 7};

        Assert.assertEquals(actual, expected);
    }
}
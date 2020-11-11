package com.epam.homework1.task2.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class YearServiceTest {

    @Test
    public void testDayInMonth() {

        int actual = YearService.dayInMonth(2000, 12);
        int expected = 31;

        assertEquals(actual, expected, "test should return right count of the days");
    }
}
package com.epam.homework1.task5.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PerfectNumberTest {

    @Test
    public void testIsPerfect() {

        boolean actual = PerfectNumber.isPerfect(6);

        assertTrue(actual);
    }
}
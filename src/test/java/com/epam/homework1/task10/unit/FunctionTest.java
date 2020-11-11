package com.epam.homework1.task10.unit;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FunctionTest {

    @Test
    public void testFindTg() {

        double[][] actual = Function.findTg(1,2, 0.5);
        double[][] expected = {{1,1.5,2}, {1.557, 14.101, -2.185}};

        assertEquals(actual[0], expected[0]);
        assertEquals(actual[1], expected[1], 0.001);
    }
}
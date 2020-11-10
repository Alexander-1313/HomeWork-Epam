package com.epam.homework1.task9.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task9.unit.RadiusService;

public class RadiusRunner {

    public static void main(String[] args) {

        RadiusService.calculateSquareAndCircumference(DataReader.enterDoubleFromConsole());
    }
}

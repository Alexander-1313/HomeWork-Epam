package com.epam.homework1.task6.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task6.unit.TimeService;

public class TimeRunner {

    public static void main(String[] args) {

        TimeService.calculateTime((long) DataReader.enterIntFromConsole());

    }
}

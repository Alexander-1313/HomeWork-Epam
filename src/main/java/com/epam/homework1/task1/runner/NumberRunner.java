package com.epam.homework1.task1.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task1.unit.NumberService;

public class NumberRunner {

    public static void main(String[] args) {

        System.out.println(NumberService.lastDigitOfSqrNumber(DataReader.enterIntFromConsole()));

    }
}

package com.epam.homework1.task2.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task2.unit.YearService;

public class YearRunner {

    public static void main(String[] args) {

        System.out.println(YearService.dayInMonth(DataReader.enterIntFromConsole(), DataReader.enterIntFromConsole()));

    }
}

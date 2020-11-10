package com.epam.homework1.task5.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task5.unit.PerfectNumber;

public class PerfectNumberRunner {

    public static void main(String[] args) {

        System.out.println(PerfectNumber.isPerfect(DataReader.enterIntFromConsole()));
    }
}

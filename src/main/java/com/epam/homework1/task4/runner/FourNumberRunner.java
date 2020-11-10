package com.epam.homework1.task4.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task4.unit.FourNumbers;

public class FourNumberRunner {

    public static void main(String[] args) {

        System.out.println(FourNumbers.isEven(DataReader.enterFourIntFromConsole()));

    }

}

package com.epam.homework1.task7.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task7.unit.Dots;

public class DotsRunner {

    public static void main(String[] args) {

        System.out.println(Dots.closestPoint(DataReader.enterIntFromConsole(), DataReader.enterIntFromConsole(),
                DataReader.enterIntFromConsole(), DataReader.enterIntFromConsole()));
    }
}

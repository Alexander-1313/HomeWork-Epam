package com.epam.homework1.task3.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task3.unit.FigureService;

public class FigureRunner {

    public static void main(String[] args) {

        System.out.println(FigureService.howManyTimesInSquareLessThenOutSquare(DataReader.enterDoubleFromConsole(), DataReader.enterDoubleFromConsole()));

    }

}

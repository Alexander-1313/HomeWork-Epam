package com.epam.homework1.task10.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task10.unit.Function;

public class FunctionRunner {

    public static void main(String[] args) {

        System.out.println(Function.findTg(DataReader.enterDoubleFromConsole(),DataReader.enterDoubleFromConsole(),
                DataReader.enterDoubleFromConsole()));

    }
}

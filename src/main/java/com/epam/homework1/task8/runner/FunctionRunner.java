package com.epam.homework1.task8.runner;

import com.epam.homework1.scanner.DataReader;
import com.epam.homework1.task10.unit.Function;
import com.epam.homework1.task8.unit.FunctionService;

public class FunctionRunner {

    public static void main(String[] args) {

        System.out.println(FunctionService.F(DataReader.enterDoubleFromConsole()));

    }

}

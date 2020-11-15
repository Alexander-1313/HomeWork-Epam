package com.epam.homework2.task5;

public class IntegerMultiply {

    public int multiplyInteger(Integer[] args) {

        int multiply = 1;

        for (int i = 0; i < args.length; i++) {
            multiply *= args[i];
        }

        return multiply;
    }
}

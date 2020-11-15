package com.epam.homework2.task3;

import java.util.Random;

public class NumberGenerator {

    private final Random rand = new Random();

    public void outputRandomNumbersContinueWithNextLine(int count){
        System.out.println(rand.nextInt() % 29);
    }

    public void outputRandomNumbersWithoutContinueWithNextLine(int count){
        System.out.print(rand.nextInt() % 29);
    }
}

package com.epam.homework1.task5.unit;

public class PerfectNumber {

    public static boolean isPerfect(int number) {
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (sum % i == 0) sum += i;
        }

        if (sum == number) return true;

        return false;
    }
}

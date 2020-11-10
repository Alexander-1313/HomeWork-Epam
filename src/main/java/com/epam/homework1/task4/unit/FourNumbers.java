package com.epam.homework1.task4.unit;

public class FourNumbers {

    public static boolean isEven(int... arr){
        int counter = 0;
        for (int el: arr) {
            if(el%2 == 0){
                counter++;
            }
            if(counter > 1){
                return true;
            }
        }
        return false;
    }
}

package com.epam.homework1.task1.unit;

public class NumberService {

    public static Number lastDigitOfSqrNumber(int number) {
        number %= 10;
        number *= number;

        return number%10;
    }

    public static Number lastDigitOfSqrNumber(Double number) {
        char[] charNumber = Double.toString(number).toCharArray();
        char lastNumberCharDigit = charNumber[charNumber.length - 1];
        int lastNumberDigit = Integer.valueOf(String.valueOf(lastNumberCharDigit));
        double numberSquared = Math.pow(lastNumberDigit, 2);
        return (int) numberSquared % 10;
    }

}

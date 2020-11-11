package com.epam.homework1.task9.unit;

public class RadiusService {

    public static double[] calculateSquareAndCircumference(double radius){
        double square = Math.pow(radius, 2) * Math.PI;
        double circumference = 2 * Math.PI * radius;
        double[] squareAndCircumference = {square, circumference};

        return squareAndCircumference;
    }
}

package com.epam.homework1.task9.unit;

public class RadiusService {

    public static void calculateSquareAndCircumference(double radius){
        double square = Math.pow(radius, 2) * Math.PI;
        double circumference = 2 * Math.PI * radius;
        System.out.println("square = " + square + "\tcircumference = " + circumference);
    }
}

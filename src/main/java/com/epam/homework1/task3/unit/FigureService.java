package com.epam.homework1.task3.unit;

public class FigureService {

    public static double areaOfSquareInCircle(double areaOfOutSquare) {
        double circleRadius = calculateRadiusOfCircleByAreaOfOutSquare(areaOfOutSquare);
        double areaOfSquare = calculateAreaOfSquareInCircle(circleRadius);
        return areaOfOutSquare;
    }

    public static double calculateRadiusOfCircleByAreaOfOutSquare(double areaOfOutSquare) {
        return Math.sqrt(areaOfOutSquare) / 2;
    }

    public static double calculateAreaOfSquareInCircle(double radius) {
        double squareSide = radius * 2 / Math.sqrt(2);
        return Math.pow(squareSide, 2);
    }

    public static double howManyTimesInSquareLessThenOutSquare(double inSquare, double outSquare){
        return inSquare / outSquare;

    }
}

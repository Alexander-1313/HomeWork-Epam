package com.epam.homework1.task7.unit;

public class Dots {

    public static String closestPoint(int x1, int y1, int x2, int y2){

        double distancePointA = Math.sqrt(x1*x1 + y1*y1);
        double distancePointB = Math.sqrt(x2*x2 + y2*y2);

        if(distancePointB > distancePointA ) return "A";
        else if(distancePointA == distancePointB) return "Одинакого далеко";
        else return "B";

    }
}

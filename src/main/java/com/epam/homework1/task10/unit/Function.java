package com.epam.homework1.task10.unit;

public class Function {

    public static double[][] findTg(double a, double b, double h){

        double[][] arrayFunc = new double[2][(int) Math.ceil(Math.abs((a - b) / h)) + 1];
        int k = 0;

        if(b < a){
            return null;
        }
        do{
            arrayFunc[0][k] = a;
            arrayFunc[1][k] = Math.tan(a);
            a += h;
            k++;
        }while(a <= b + h/2);

        return arrayFunc;
    }
}

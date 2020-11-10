package com.epam.homework1.task8.unit;

import static java.lang.Math.*;

public class FunctionService {

    public static double F(double x){
        if(x >= 3){
            return -pow(x,2) + 3 * x + 9;
        }else{
            return 1 / (pow(x,3) - 6);
        }
    }
}

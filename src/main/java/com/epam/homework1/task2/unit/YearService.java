package com.epam.homework1.task2.unit;

public class YearService {

    public static int dayInMonth(int year, int month) {

        if(year < 0 || month < 0 || month > 12){
            throw new IllegalArgumentException();
        }

        int days = 0;

        if((month != 2) && month < 8){
            if(month % 2 == 1)
                days = 31;
            else days = 30;
        }
        if(month >= 8 ){
            if(month % 2 == 1)
                days = 30;
            else days = 31;
        }

        if(month == 2 && year % 400 == 0) days = 28;
        else if(month == 2 && year % 100 == 0) days = 29;
        else if(month == 2 && year % 4 == 0) days = 28;
        else if(month == 2) days = 29;

        return days;
    }
}

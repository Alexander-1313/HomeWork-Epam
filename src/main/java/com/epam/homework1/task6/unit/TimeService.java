package com.epam.homework1.task6.unit;

public class TimeService {

    private static final int secondsInHour = 3600;
    private static final int secondsInMinute = 60;

    public static long[] calculateTime(Long seconds) {
        long hours = seconds / secondsInHour;
        long minutes = (seconds - hours * secondsInHour) / secondsInMinute;

        seconds = seconds - (hours * secondsInHour) - (minutes * secondsInMinute);

        long[] time = new long[]{hours, minutes, seconds};

        return time;
    }

}

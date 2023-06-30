package com.rloup.leetcode.problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfTheYear {
    public int dayOfYear(String date) {

        int[] monthLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] split = date.split("-");
        int m = Integer.parseInt(split[1]) - 1;
        int d = Integer.parseInt(split[2]);
        int y = Integer.parseInt(split[0]);


        int dayOfYear = (y % 4 == 0) && (m > 1) && (y != 1900) ?
                d + 1 : d;

        while (m != 0) {
            dayOfYear += monthLength[--m];
        }

        return dayOfYear;
    }

    public int dayOfYear1(String date) {
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).getDayOfYear();

    }
}

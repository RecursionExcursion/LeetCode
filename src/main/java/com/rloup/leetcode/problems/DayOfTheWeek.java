package com.rloup.leetcode.problems;

import java.time.LocalDate;

public class DayOfTheWeek {

    public String dayOfTheWeek(int day, int month, int year) {

        String[] weekDays = new String[]{"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};

        return weekDays[(int) (LocalDate.of(year, month, day).toEpochDay() % 7)];
    }
}

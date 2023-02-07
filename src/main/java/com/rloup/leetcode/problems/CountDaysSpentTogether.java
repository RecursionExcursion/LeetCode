package com.rloup.leetcode.problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

public class CountDaysSpentTogether {
    public static void main(String[] args) {
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
        System.out.println(countDaysTogether("10-01", "10-31", "11-01", "12-31"));
    }

    private static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        Function<String, LocalDate> stringToDate = s -> {
            String format = "yyyy-MM-dd", year = "1999-";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
            return LocalDate.parse(year + s, formatter);
        };

        LocalDate aliceArr = stringToDate.apply(arriveAlice);
        LocalDate aliceDep = stringToDate.apply(leaveAlice);

        LocalDate bobArr = stringToDate.apply(arriveBob);
        LocalDate bobDep = stringToDate.apply(leaveBob);

        int firstDepDay = aliceDep.isAfter(bobDep) ? bobDep.getDayOfYear() : aliceDep.getDayOfYear();
        int secondArrDay = aliceArr.isAfter(bobArr) ? aliceArr.getDayOfYear() : bobArr.getDayOfYear();
        return Math.max(firstDepDay - secondArrDay + 1, 0);
    }
}

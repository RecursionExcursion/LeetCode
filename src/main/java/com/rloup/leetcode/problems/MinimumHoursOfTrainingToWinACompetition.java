package com.rloup.leetcode.problems;

import java.util.function.Consumer;

public class MinimumHoursOfTrainingToWinACompetition {
    public static void main(String[] args) {

        Consumer<Integer> printInt = System.out::println;

        int i = minNumberOfHours(5, 3, new int[]{1, 4, 3, 2}, new int[]{2, 6, 3, 1});
        int i2 = minNumberOfHours(2, 4, new int[]{1}, new int[]{3});
        int i3 = minNumberOfHours(1, 1, new int[]{1, 1, 1, 1}, new int[]{1, 1, 1, 50});
        int i4 = minNumberOfHours(100, 100, new int[]{1,2,3,4,5,6,7,8,9}, new int[]{1,2,3,1,2,3,1,2,10});
        int i5 = minNumberOfHours(5, 3, new int[]{1,4}, new int[]{2,5});
        printInt.accept(i);
        printInt.accept(i2);
        printInt.accept(i3);
        printInt.accept(i4);
        printInt.accept(i5);
    }

    public static int minNumberOfHours(int initialEnergy,
                                       int initialExperience,
                                       int[] energy,
                                       int[] experience) {

        int trainingHoursNeeded = 0;

        int myExp = initialExperience;

        int totalOppEnergy = 0;
        for (int i = 0; i <  energy.length; i++) {

            totalOppEnergy += energy[i];

            int opExp = experience[i];
            if (opExp >= myExp) {
                int hoursNeeded = opExp - myExp + 1;
                trainingHoursNeeded += hoursNeeded;
                myExp += hoursNeeded;
            }
            myExp += opExp;
        }

        if(totalOppEnergy >= initialEnergy){
            trainingHoursNeeded += totalOppEnergy - initialEnergy + 1;
        }

        return trainingHoursNeeded;
    }
}

package com.rloup.leetcode.problems;

public class CheckIfItIsAStraightLine {
//    public boolean checkStraightLine(int[][] coordinates) {
//
//        Map<Integer, Integer> coordsMap = new HashMap<>();
//        for (var c : coordinates) {
//            coordsMap.put(c[0], c[1]);
//        }
//
//        if (coordsMap.size() == 1) return true;
//
//        BiFunction<Map.Entry<Integer, Integer>, Map.Entry<Integer, Integer>, Double> getSlope =
//                (a, b) -> (double) (b.getValue() - a.getValue()) / (b.getKey() - a.getValue());
//
//        Iterator<Map.Entry<Integer, Integer>> iterator = coordsMap.entrySet().iterator();
//
//
//        double slope = getSlope.apply(iterator.next(), coordinates[1]);
//
//
//        for (int i = 1; i < coordinates.length - 1; i++) {
//            double currentSlope = getSlope.apply(coordinates[i], coordinates[i + 1]);
//
//            if (slope != currentSlope) {
//                return false;
//            }
//        }
//        return true;
//    }
//    public boolean checkStraightLine(int[][] coordinates) {
//
////        Arrays.sort(coordinates, (a, b) -> a[0] - b[0] != 0 ? a[0] - b[0] : a[1] - b[1]);
//
//        BiFunction<int[], int[], Double> getSlope = (a, b) -> (double) (b[1] - a[1]) / (b[0] - a[0]);
//
//        double slope = getSlope.apply(coordinates[0], coordinates[1]);
//
//        for (int i = 1; i < coordinates.length - 1; i++) {
//            double currentSlope = getSlope.apply(coordinates[i], coordinates[i + 1]);
//
//            if (slope != currentSlope) {
//                if(currentSlope && slope)
//                return false;
//            }
//        }
//        return true;
//    }
}

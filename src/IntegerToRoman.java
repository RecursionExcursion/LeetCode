public class IntegerToRoman {
    public static void main(String[] args) {
        int i = 11;
        int i2 = 4;
        int i3 = 14;
        int i4 = 99;
        int i5 = 1720;
        int i6 = 1200;
        int i7 = 1949;

        System.out.println(intToRomanClean(i));
        System.out.println(intToRomanClean(i2));
        System.out.println(intToRomanClean(i3));
        System.out.println(intToRomanClean(i4));
        System.out.println(intToRomanClean(i5));
        System.out.println(intToRomanClean(i6));
        System.out.println(intToRomanClean(i7));

    }

//    public static String intToRoman(int num) {
//        StringBuilder stringToReturn = new StringBuilder();
//
//        double decimalNum = num / 10.0;
//        int decimal = (int) decimalNum;
//        int fractional = (int) ((decimalNum - decimal) * 10);
//        if (fractional)
//
//
//
//
//
//
//
//
//            return stringToReturn.toString();
//    }

//    public static String intToRoman(int num) {
//        StringBuilder stringToReturn = new StringBuilder();
//
//        if (num >= 1000) {
//            int x = num / 1000;
//            stringToReturn.append("M".repeat(x));
//            num -= x * 1000;
//        }
//
//        if (num >= 100) {
//            int x = num / 100;
//            if (num >= 900) {
//                stringToReturn.append("CM");
//                num -= 900;
//            } else if (num >= 500) {
//                stringToReturn.append("D");
//                x -= 5;
//                num -= 500;
//            }
//            if (num >= 400) {
//                stringToReturn.append("CD");
//                num -= 400;
//            } else if (num >= 100) {
//                stringToReturn.append("C".repeat(x));
//                num -= x * 100;
//            }
//        }
//
//        if (num >= 10) {
//            int x = num / 10;
//            if (num >= 90) {
//                stringToReturn.append("XC");
//                num -= 90;
//            } else if (num >= 50) {
//                stringToReturn.append("L");
//                x -= 5;
//                num -= 50;
//            }
//            if (num >= 40) {
//                stringToReturn.append("XL");
//                num -= 40;
//            } else if (num >= 10) {
//                stringToReturn.append("X".repeat(x));
//                num -= x * 10;
//            }
//        }
//
//        if (num >= 1) {
//            int x = num;
//            if (num >= 9) {
//                stringToReturn.append("IX");
//                num -= 9;
//            } else if (num >= 5) {
//                stringToReturn.append("V");
//                x -= 5;
//                num -= 5;
//            }
//            if (num == 4) stringToReturn.append("IV");
//            else if (num >= 1) stringToReturn.append("I".repeat(x));
//        }
//
//        return stringToReturn.toString();


//    }
//


    public static String intToRomanClean(int num) {
        StringBuilder stringToReturn = new StringBuilder();

        if (num >= 1000) {
            int x = num / 1000;
            stringToReturn.append("M".repeat(x));
            num -= x * 1000;
        }

        if (num >= 100) {
            num = convertNumToRomanInt(num,100, stringToReturn, "CM", "D", "CD", "C");
        }

        if (num >= 10) {
            num = convertNumToRomanInt(num, 10,stringToReturn, "XC", "L", "XL", "X");
        }

        if (num >= 1) {
            num = convertNumToRomanInt(num, 1, stringToReturn, "IX", "V", "IV", "I");
        }

        return stringToReturn.toString();
    }

    private static int convertNumToRomanInt(int num, int letterPosition, StringBuilder stringToReturn, String romanNines,
                                            String romanFives, String romansFours, String romansOnes) {
        int x = num / letterPosition;
        if (x >= 9) {
            stringToReturn.append(romanNines);
            num -= 9 * letterPosition;
            x -= 9;
        } else if (x >= 5) {
            stringToReturn.append(romanFives);
            x -= 5;
            num -= 5 * letterPosition;
        }
        if (x >= 4) {
            stringToReturn.append(romansFours);
            num -= 4 * letterPosition;
        } else if (x >= 1) {
            stringToReturn.append(romansOnes.repeat(x));
            num -= x * letterPosition;
        }
        return num;
    }
}

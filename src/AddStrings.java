public class AddStrings {
    public static void main(String[] args) {
        String num1 = "456", num2 = "77", num3 = "11", num4 = "123", num5 = "0", num6 = "0";

        System.out.println(addStrings(num1, num2));
        System.out.println(addStrings(num3, num4));
        System.out.println(addStrings(num5, num6));
        System.out.println(addStrings("9", "1"));

    }

    public static String addStrings(String num1, String num2) {

        StringBuilder sb = new StringBuilder();

        int carry = 0;
        for (int i = 1; i <= (Math.max(num1.length(), num2.length())); i++) {

            int ans = (i <= num1.length() ? Character.getNumericValue(num1.charAt(num1.length() - i)) : 0) +
                    (i <= num2.length() ? Character.getNumericValue(num2.charAt(num2.length() - i)) : 0) +
                    carry;

            if (ans > 9) {
                carry = 1;
                ans -= 10;
            } else {
                carry = 0;
            }
            sb.append(ans);
        }
        return carry == 0 ? sb.reverse().toString() : sb.append("1").reverse().toString();
    }

//    public static String addStrings(String num1, String num2) {
//
//        char[] charArr1 = num1.toCharArray();
//        char[] charArr2 = num2.toCharArray();
//
//        StringBuilder sb = new StringBuilder();
//
//        int carry = 0;
//        for (int i = 1; i <= (Math.max(charArr1.length, charArr2.length)); i++) {
//
//            int ans = (i <= charArr1.length ? Character.getNumericValue(charArr1[charArr1.length - i]) : 0) +
//                    (i <= charArr2.length ? Character.getNumericValue(charArr2[charArr2.length - i]) : 0) +
//                    carry;
//
//            if (ans > 9) {
//                carry = 1;
//                ans -= 10;
//            } else {
//                carry = 0;
//            }
//            sb.append(ans);
//        }
//        return carry == 0 ? sb.reverse().toString() : sb.append("1").reverse().toString();
//    }

//    public static String addStrings(String num1, String num2) {
//
//        char[] charArr1 = num1.toCharArray();
//        char[] charArr2 = num2.toCharArray();
//
//        StringBuilder sb = new StringBuilder();
//
//        int carry = 0;
//        for (int i = charArr1.length - 1, j = charArr2.length - 1;
//             i >= 0 || j >= 0;
//             i--, j--) {
//            int ans = (i >= 0 ? Character.getNumericValue(charArr1[i]) : 0) +
//                    (j >= 0 ? Character.getNumericValue(charArr2[j]) : 0) +
//                    carry;
//            if (ans > 9) {
//                carry = 1;
//                ans -= 10;
//            } else {
//                carry = 0;
//            }
//            sb.append(ans);
//        }
//        return carry == 0 ? sb.reverse().toString() : sb.append("1").reverse().toString();
//    }
}

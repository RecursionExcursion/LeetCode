public class StringToInteger {
    public static void main(String[] args) {

        String s33 = "+3.15645645";
        String s44 = "0-1";

        System.out.println(s33.matches("(?!(-|[+])?\\d+)"));
        System.out.println(s44.matches("(?!(-|[+])?\\d+)"));


        String s = "   -3.213-4324";
        String s2 = "   +3.2134324 with words";
        String s3 = "  -0012a42";
        String s4 = "0-1";
        String s5 = "abc";
        String s6 = "abc123";
        System.out.println(myAtoi(s));
        System.out.println(myAtoi(s2));
        System.out.println(myAtoi(s3));
        System.out.println(myAtoi(s4));
        System.out.println(myAtoi(s5));
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        String[] words = s.split("(?<=\\d)\\D");
        double ans = (words.length > 0 && words[0].matches("([+]|-)?\\d(.\\d*)?")) ? Double.parseDouble(words[0]) : 0;
        if (ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        else if (ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        else return (int) ans;
    }
}



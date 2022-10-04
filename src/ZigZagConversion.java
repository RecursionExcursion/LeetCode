import java.util.Arrays;
import java.util.Objects;

public class ZigZagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String s2 = "PAYPALISHIRING";
        int numRows2 = 4;
        String s3 = "AA";
        int numRows3 = 2;

        System.out.println(convert(s, numRows));
        System.out.println(convert(s2, numRows2));
        System.out.println(convert(s3, numRows3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        String[] stringRows = new String[numRows], strings = s.split("");
        boolean interateUp = false;
        int c = 0, i = 0;
        while (c < s.length()) {

            stringRows[i] = (stringRows[i] == null) ? strings[c++] : stringRows[i] + strings[c++];

            if (i % (numRows - 1) != 0) {
                if (interateUp) i++;
                else i--;
            } else {
                if (interateUp) i--;
                else i++;
                interateUp = !interateUp;
            }
        }
        return Arrays.stream(stringRows).filter(Objects::nonNull).reduce("", (a, b) -> a + b);
    }
}


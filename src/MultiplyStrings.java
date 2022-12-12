import java.util.ArrayList;
import java.util.List;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2", "3"));
        System.out.println(multiply("123", "456"));
        System.out.println(123 * 456);
        System.out.println(multiply("22", "123"));
        System.out.println(123 * 22);
        System.out.println(multiply("123456789", "987654321"));
        System.out.println(multiply("5", "408"));


    }

    private static String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) return "0";

        List<String> productStrings = new ArrayList<>();

        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder();

            int carry = 0;

            for (int j = num2.length() - 1; j >= 0; j--) {

                int n1 = Character.getNumericValue(num1.charAt(i));
                int n2 = Character.getNumericValue(num2.charAt(j));

                int prod = n1 * n2 + carry;
                carry = 0;

                if (j != 0) {
                    while (prod > 9) {
                        prod -= 10;
                        carry++;
                    }
                } else {
                    sb.append(reverseInt(prod));
                    break;
                }
                sb.append(prod);
            }
            sb.reverse().append("0".repeat(productStrings.size())).reverse();

            productStrings.add(sb.toString());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0, carry = 0; i < productStrings.get(productStrings.size() - 1).length(); i++) {

            int ans = 0;
            for (String s : productStrings) {

                int number = i > s.length() - 1 ? 0 : Character.getNumericValue(s.charAt(i));

                ans += number;
            }
            ans += carry;
            carry = 0;
            if (i != productStrings.get(productStrings.size() - 1).length() - 1) {
                while (ans > 9) {
                    carry++;
                    ans -= 10;
                }
            } else {
                sb.append(reverseInt(ans));
                return sb.reverse().toString();
            }
            sb.append(ans);

        }

        return sb.reverse().toString();
    }

    private static String reverseInt(int ans) {
        return new StringBuilder().append(ans)
                                  .reverse()
                                  .toString();
    }
}

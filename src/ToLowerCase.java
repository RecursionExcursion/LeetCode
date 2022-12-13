public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }

    public static String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int charInt = chars[i];
            if (charInt >= 65 && charInt <= 90) {
                charInt += 32;
                chars[i] = (char) charInt;
            }
        }
        return new String(chars);
    }
}

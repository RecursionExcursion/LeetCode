public class ReverseVowelsOfAString {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        String s3 = "aA";


        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
        System.out.println(reverseVowels(s3));

    }

    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, j = s.length() - 1; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                while (!isVowel(s.charAt(j))) j--;
                sb.append(s.charAt(j--));
            } else sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    private static boolean isVowel(char c) {
        char tempC = Character.toLowerCase(c);
        return tempC == 'a' ||
                tempC == 'e' ||
                tempC == 'i' ||
                tempC == 'o' ||
                tempC == 'u';
    }
}

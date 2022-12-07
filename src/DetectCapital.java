public class DetectCapital {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("A"));
        System.out.println(detectCapitalUse("g"));

        System.out.println(detectCapitalUse("leetCode"));
        System.out.println(detectCapitalUse("lEetcode"));
        System.out.println(detectCapitalUse("LeeTcode"));

    }

    private static boolean detectCapitalUse(String word) {

        char[] chars = word.toCharArray();

        if (chars.length == 1) return true;

        boolean mustBeAllLowerCase = !isCapitalized(chars[0]);
        if (mustBeAllLowerCase && isCapitalized(chars[1])) return false;
        boolean mustBeAllCaps = isCapitalized(chars[1]);

        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (mustBeAllCaps) {
                if (!isCapitalized(c)) return false;
            } else {
                if (isCapitalized(c)) return false;
            }
            if (mustBeAllLowerCase) {
                if (isCapitalized(c)) return false;
            }
        }
        return true;
    }

    private static boolean isCapitalized(char c) {
        return c >= 65 && c <= 90;
    }
}

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "pwwkew";
        String s2 = "abcabcbb";
        String s3 = "bbbbb";
        String s4 = "au";
        String s5 = "aab";
        String s6 = "dvdf";


        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
        System.out.println(lengthOfLongestSubstring(s5));
        System.out.println(lengthOfLongestSubstring(s6));
        System.out.println();
        System.out.println(lengthOfLongestSubstring2(s1));
        System.out.println(lengthOfLongestSubstring2(s2));
        System.out.println(lengthOfLongestSubstring2(s3));
        System.out.println(lengthOfLongestSubstring2(s4));
        System.out.println(lengthOfLongestSubstring2(s5));
        System.out.println(lengthOfLongestSubstring2(s6));
    }

    public static int lengthOfLongestSubstring(String s) {

        String[] chars = s.split("");

        int longestStringLength = 0;
        Set<String> usedLetters = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {

            if (!usedLetters.add(chars[i])) {
                stringBuilder.setLength(0);
                usedLetters.clear();
                if (i != chars.length - 1) {
                    for (int j = i - 1; j >= 0; j--) {
                        if (chars[j].equals(chars[i])) {
                            i = j == i - 1 ? i : ++j;
                            break;
                        }
                    }
                }
            }
            usedLetters.add(chars[i]);
            stringBuilder.append(chars[i]);
            if (longestStringLength < stringBuilder.length()) longestStringLength++;
        }
        return longestStringLength;
    }

    public static int lengthOfLongestSubstring2(String s) {

        int longestStringLength = 0;
        Map<Character, Integer> cache = new HashMap<>();

        for (int i = 0, j = 0; i < s.length(); i++) {

            if (cache.containsKey(s.charAt(i))) {
                int c = cache.get(s.charAt(i));
                cache.put(s.charAt(i), i);
                j = Math.max(j, c+1);
            } else {
                cache.putIfAbsent(s.charAt(i), i);
            }
            longestStringLength = Math.max(longestStringLength, i - j+1);
        }
        return longestStringLength;
    }
}

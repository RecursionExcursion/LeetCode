import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
    }

    public static boolean isIsomorphic2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        String[] sArray = s.split("");
        String[] tArray = t.split("");

        Map<String, String> charMap = new HashMap<>();

        for (int i = 0; i < sArray.length; i++) {

            if (charMap.containsKey(sArray[i])) {
                if (!charMap.get(sArray[i]).equals(tArray[i])) {
                    return false;
                }
            } else {
                for (String l : charMap.values()) {
                    if (l.equals(tArray[i])) {
                        return false;
                    }
                }
                charMap.putIfAbsent(sArray[i], tArray[i]);

            }


        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (charMap.containsKey(s.charAt(i))) {
                if (charMap.get(s.charAt(i)) != (t.charAt(i))) {
                    return false;
                }
            } else {
                for (char c : charMap.values()) {
                    if (c == (t.charAt(i))) {
                        return false;
                    }
                }
                charMap.putIfAbsent(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}

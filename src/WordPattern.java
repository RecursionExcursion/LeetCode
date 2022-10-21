import java.util.LinkedHashSet;
import java.util.List;

public class WordPattern {
    public static void main(String[] args) {


        String pattern = "abba";
        String word = "dog cat cat dog";

        String pattern2 = "deadbeef";
        String word2 = "d e a d b e e f";


        System.out.println(wordPattern(pattern, word));
        System.out.println(wordPattern(pattern2, word2));

        System.out.println(Character.getNumericValue('a'));


    }

    public static boolean wordPattern(String pattern, String s) {

        String[] patternStrings = pattern.split("");
        String[] wordStrings = s.split(" ");

        if(patternStrings.length!= wordStrings.length) return false;

        List<String> pSet = new LinkedHashSet<>(List.of(patternStrings)).stream().toList();
        List<String> wSet = new LinkedHashSet<>(List.of(wordStrings)).stream().toList();

        if (pSet.size() != wSet.size()) return false;

        for (int i = 0; i < patternStrings.length; i++) {
            if (pSet.indexOf(patternStrings[i]) != wSet.indexOf(wordStrings[i])) return false;
        }
        return true;
    }
}

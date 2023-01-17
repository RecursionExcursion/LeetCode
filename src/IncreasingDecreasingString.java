import java.util.*;
import java.util.stream.IntStream;

public class IncreasingDecreasingString {
    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        String s2 = "rat";
        String s3 = "cccccbbbbbaaaaa";
        String s4 = "leetcode";


        System.out.println(sortString(s));
        System.out.println(sortString(s2));
        System.out.println(sortString(s3));
        System.out.println(sortString(s4));
    }

    public static String sortString(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        char[] chars = s.toCharArray();

        List<Character> characterList = new ArrayList<>(IntStream.range(0, chars.length)
                                                                 .mapToObj(i -> chars[i])
                                                                 .toList());

        while (!characterList.isEmpty()) {

            List<Character> distinctCharList = getDistinctCharacters(characterList);

            for (Character c : distinctCharList) {
                stringBuilder.append(c);
                characterList.remove(c);
            }

            distinctCharList = getDistinctCharacters(characterList);
            Collections.reverse(distinctCharList);

            for (Character c : distinctCharList) {
                stringBuilder.append(c);
                characterList.remove(c);
            }
        }


        return stringBuilder.toString();
    }

    private static List<Character> getDistinctCharacters(List<Character> characterList) {
        List<Character> distinctCharList = new ArrayList<>(characterList.stream()
                                                                        .distinct()
                                                                        .toList());
        Collections.sort(distinctCharList);

        return distinctCharList;
    }

//    public static String sortString(String s) {
//
//        StringBuilder stringBuilder = new StringBuilder();
//
//        char[] chars = s.toCharArray();
//
//        List<Character> characterList = new ArrayList<>(IntStream.range(0, chars.length)
//                                                                 .mapToObj(i -> chars[i])
//                                                                 .sorted()
//                                                                 .toList());
//
//        while (!characterList.isEmpty()) {
//
//            List<Character> temp = new ArrayList<>(new HashSet<>(characterList));
//            Collections.sort(temp);
//            Set<Character> charSet = new LinkedHashSet<>(temp);
//
//            for (Character c : charSet) {
//                stringBuilder.append(c);
//                characterList.remove(c);
//            }
//
//            temp = new ArrayList<>(new HashSet<>(characterList));
//            temp.sort(Collections.reverseOrder());
//            charSet = new LinkedHashSet<>(temp);
//
//            for (Character c : charSet) {
//                stringBuilder.append(c);
//                characterList.remove(c);
//            }
//        }
//
//        return stringBuilder.toString();
//    }
}

import java.util.function.ToIntFunction;
import java.util.stream.IntStream;

public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcde"));
        System.out.println(findTheDifference("abcd", "aabcd"));
        System.out.println(findTheDifference("", "y"));

    }

    public static char findTheDifference(String s, String t) {

        ToIntFunction<String> stringToAscii = (str) -> IntStream.range(0, str.length())
                                                                .mapToObj(str::charAt)
                                                                .reduce((char) 0, (a, b) -> (char) (a + b));

        return (char) (stringToAscii.applyAsInt(t) - stringToAscii.applyAsInt(s));
    }
}

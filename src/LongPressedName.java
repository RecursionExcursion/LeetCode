import java.util.ArrayDeque;

public class LongPressedName {
    public static void main(String[] args) {
        System.out.println(isLongPressedName("alex", "aaleex"));
        System.out.println(isLongPressedName("saeed", "ssaaedd"));
        System.out.println(isLongPressedName("alex", "aaleexa"));
        System.out.println(isLongPressedName("vtkgn", "vttkgnn"));
        System.out.println(isLongPressedName("alexd", "ale"));
        System.out.println(isLongPressedName("abcd", "aaabbbcccddd"));


    }

    private static boolean isLongPressedName(String name, String typed) {

        ArrayDeque<Character> typedCharsDQ = new ArrayDeque<>(typed.chars().mapToObj(c -> (char) c).toList());
        ArrayDeque<Character> nameCharsDQ = new ArrayDeque<>(name.chars().mapToObj(c -> (char) c).toList());

        while (!nameCharsDQ.isEmpty()) {

            char current = nameCharsDQ.pop();
            int x = 1;
            while (!nameCharsDQ.isEmpty() && nameCharsDQ.peek() == current) {
                nameCharsDQ.pop();
                x++;
            }

            int y = 0;
            while (!typedCharsDQ.isEmpty() && typedCharsDQ.peek() == current) {
                typedCharsDQ.pop();
                y++;
            }
            if (x > y) return false;
        }

        return typedCharsDQ.isEmpty();
    }
}

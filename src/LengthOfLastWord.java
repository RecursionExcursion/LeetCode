
public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "boobs";
		
		System.out.println(lengthOfLastWord(s));
		
		
	}

	public static int lengthOfLastWord(String s) {
		if (s.isEmpty()) {
			return 0;
		}

		String[] words = s.split(" ");

		return words[words.length - 1].length();

	}
}

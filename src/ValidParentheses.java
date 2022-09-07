import java.util.ArrayList;

public class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("([])"));
	}

	public static boolean isValid(String s) {

		ArrayList<Character> openList = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			
			case '(':
				openList.add('(');
				break;

			case '[':
				openList.add('[');
				break;

			case '{':
				openList.add('{');
				break;

			case ')':
				if (openList.isEmpty()
						|| openList.get(openList.size() - 1) != '(') {
					return false;
				} else {
					openList.remove(openList.size() - 1);
				}
				break;

			case ']':
				if (openList.isEmpty()
						|| openList.get(openList.size() - 1) != '[') {
					return false;
				} else {
					openList.remove(openList.size() - 1);
				}
				break;

			case '}':
				if (openList.isEmpty()
						|| openList.get(openList.size() - 1) != '{') {
					return false;
				} else {
					openList.remove(openList.size() - 1);
				}
				break;

			
			}

		}
		if (openList.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}

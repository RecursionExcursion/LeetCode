public class LongestPrefix {
	public static void main(String[] args) {
		String[] s = { "butt", "doggies", "dobby", "butt" };
		System.out.println(longestCommonPrefix(s));
	}

	public static String longestCommonPrefix(String[] strings) {

		String prefix = strings[0];
		StringBuilder sBuilder = new StringBuilder();
		boolean isPrefix = false;
		if(strings.length==1) {
			return strings[0];
		}

		for (int i = 1; i < strings.length; i++) {

			if (!sBuilder.isEmpty()) {
				sBuilder = new StringBuilder();
			}

			for (int j = 0; j < strings[i].length()
					&& j < prefix.length(); j++) {

				if (strings[i].charAt(j) == prefix.charAt(j)) {
					sBuilder.append(prefix.charAt(j));
				} else {
					break;

				}

			}
			if (!sBuilder.isEmpty()) {
				prefix = sBuilder.toString();
				isPrefix = true;
			} else {
				isPrefix = false;
				break;
			}

		}
		if (isPrefix) {
			return prefix;
		} else {
			return "There is no common prefix among the input strings.";
		}

	}
}

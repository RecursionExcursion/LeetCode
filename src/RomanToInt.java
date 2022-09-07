
public class RomanToInt {
	public static void main(String[] args) {
		System.out.println(romanToInt("MCMXCIV"));
		System.out.println(romanToIntFaster("MCMXCIV"));
	}

	public static int romanToInt(String s) {
		int returnNumber = 0;

		String[] seperatedRomanNumeral = s.split("");

		for (int i = 0; i < seperatedRomanNumeral.length; i++) {

			if (seperatedRomanNumeral[i].equalsIgnoreCase("I")) {
				returnNumber += 1;
			}

			else if (seperatedRomanNumeral[i].equalsIgnoreCase("V")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("I")) {
					returnNumber += 3;
				} else {
					returnNumber += 5;
				}
			}

			else if (seperatedRomanNumeral[i].equalsIgnoreCase("X")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("I")) {
					returnNumber += 8;
				} else {
					returnNumber += 10;
				}
			} else if (seperatedRomanNumeral[i].equalsIgnoreCase("L")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("X")) {
					returnNumber += 30;
				} else {
					returnNumber += 50;
				}
			}

			else if (seperatedRomanNumeral[i].equalsIgnoreCase("C")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("X")) {
					returnNumber += 80;

				} else {
					returnNumber += 100;
				}
			}

			else if (seperatedRomanNumeral[i].equalsIgnoreCase("D")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("C")) {
					returnNumber += 300;
				} else {
					returnNumber += 500;
				}
			}

			else if (seperatedRomanNumeral[i].equalsIgnoreCase("M")) {
				if (i != 0
						&& seperatedRomanNumeral[i - 1].equalsIgnoreCase("C")) {
					returnNumber += 800;
				} else {
					returnNumber += 1000;
				}
			}
		}

		return returnNumber;

	}

	public static int romanToIntFaster(String s) {
		int returnNumber = 0;

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {

			case 'I':
				returnNumber += 1;
				break;

			case 'V':
				if (i != 0 && s.charAt(i - 1) == 'I') {
					returnNumber += 3;
				} else {
					returnNumber += 5;
				}
				break;

			case 'X':
				if (i != 0 && s.charAt(i - 1) == 'I') {
					returnNumber += 8;
				} else {
					returnNumber += 10;
				}
				break;

			case 'L':
				if (i != 0 && s.charAt(i - 1) == 'X') {
					returnNumber += 30;
				} else {
					returnNumber += 50;
				}
				break;

			case 'C':
				if (i != 0 && s.charAt(i - 1) == 'X') {
					returnNumber += 80;

				} else {
					returnNumber += 100;
				}
				break;

			case 'D':
				if (i != 0 && s.charAt(i - 1) == 'C') {
					returnNumber += 300;
				} else {
					returnNumber += 500;
				}
				break;

			case 'M':
				if (i != 0 && s.charAt(i - 1) == 'C') {
					returnNumber += 800;
				} else {
					returnNumber += 1000;
				}
				break;
			}
		}
		return returnNumber;
	}

}

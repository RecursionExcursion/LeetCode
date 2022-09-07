import java.util.Arrays;
import java.util.Collections;

public class AddBinary {

	public static void main(String[] args) {
		String a = "1";
		String b = "111";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {

		StringBuilder sBuilder = new StringBuilder();

		String[] aArray = a.split("");
		String[] bArray = b.split("");
		Collections.reverse(Arrays.asList(aArray));
		Collections.reverse(Arrays.asList(bArray));

		String[] longArray;
		String[] shortArray;

		if (aArray.length >= bArray.length) {
			longArray = aArray;
			shortArray = bArray;
		} else {
			longArray = bArray;
			shortArray = aArray;

		}

		int carry = 0;

		for (int i = 0; i < longArray.length; i++) {

			int x = i >= longArray.length ? 0 : Integer.parseInt(longArray[i]);
			int y = i >= shortArray.length ? 0 : Integer.parseInt(shortArray[i]);

			int ans = x + y + carry;

			if (ans == 3) {
				sBuilder.append(1);
				carry = 1;

			} else if (ans == 2) {
				sBuilder.append(0);
				carry = 1;

			} else if (ans == 1) {
				sBuilder.append(1);
				carry = 0;

			} else if (ans == 0) {
				sBuilder.append(0);
				carry = 0;
			}
		}
		if (carry > 0) {
			sBuilder.append(carry);
		}

		return sBuilder.reverse().toString();
	}

}

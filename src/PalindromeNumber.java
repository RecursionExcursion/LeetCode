public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println(isPalindrome(1441));
		System.out.println(isPalindrome(14561));
	}

	public static boolean isPalindrome(int x) {

//		String s = String.valueOf(x);
//		String[] split = s.split("");
//
//			int halfWay = split.length / 2;
//			
//			String[] firstHalf = new String[halfWay];
//			String[] secondHalf = new String[halfWay];
//			
//			for(int i = 0; i < halfWay;i++) {
//				firstHalf[i] = split[i];
//			}
//			for(int i = 0; i < halfWay;i++) {
//				secondHalf[i] = split[split.length-1-i];
//			}
//			
//			for(int i=0;i<firstHalf.length;i++) {
//				if(!firstHalf[i].equals(secondHalf[i])) {
//					return false;
//				}
//			}
//		
//		return true;
		String s = String.valueOf(Math.abs(x));
		String[] split = s.split("");
		boolean tf = true;
		for (int i = 0; i < split.length/2; i++) {
			int y = Integer.valueOf(split[i]);
			int z = Integer.valueOf(split[split.length - 1 - i]);
			if (z!=y) {
				tf = false;
			} 
		}
		return tf;
	}
}

//		for (int i = 0; i < split.length; i++) {
//			reverseSplit[i] = split[split.length-1-i];
//		}
//		for(int i = 0; i< split)
//
//	}

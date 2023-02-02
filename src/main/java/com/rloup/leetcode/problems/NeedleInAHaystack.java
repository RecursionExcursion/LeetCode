package com.rloup.leetcode.problems;

public class NeedleInAHaystack {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "c";
		System.out.println(strStr(s1, s2));
	}

	public static int strStr(String haystack, String needle) {
		if (needle.isEmpty()) {
			return 0;
		} else if (haystack.contains(needle)) {

			String[] splitHayStack = haystack.split("");
			String[] splitNeedle = needle.split("");

			int index = 0;

			for (int i = 0; i < splitHayStack.length; i++) {
				if (splitHayStack[i].equals(splitNeedle[0])) {
					
					if(needle.length()==1) {
						return i;
					}

					for (int j = 1; j < splitNeedle.length; j++) {
						if (splitNeedle[j].equals(splitHayStack[i + j])) {
							if (j == splitNeedle.length-1) {
								return i;
							}
							continue;
						} else {
							break;
						}

					}

				}

			}
			return index;
		} else {
			return -1;
		}
	}
	
	 public int strStrBetter(String haystack, String needle) {
     	if(needle =="" || haystack == "")
		return 0;
	else if(haystack.contains(needle)){
		return haystack.indexOf(needle);
 }
	else 
		return -1;
}

}

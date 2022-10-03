public class LongestPalindromeSubstring {
    public static void main(String[] args) {
        String s = "babadbabad";
        String s2 = "cbbd";
        String s3 = "ac";
        String s4 = "bb";
        String s5 = "z";
        String s6 = "";
        String s7 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String s8 =
                "gphyvqruxjmwhonjjrgumxjhfyupajxbjgthzdvrdqmdouuukeaxhjumkmmhdglqrrohydrmbvtuwstgkobyzjjtdtjroqpyusfsbjl" +
                        "usekghtfbdctvgmqzeybnwzlhdnhwzptgkzmujfldoiejmvxnorvbiubfflygrkedyirienybosqzrkbpcfidvkkafftgzw" +
                        "rcitqizelhfsruwmtrgaocjcyxdkovtdennrkmxwpdsxpxuarhgusizmwakrmhdwcgvfljhzcskclgrvvbrkesojyhofwqi" +
                        "whiupujmkcvlywjtmbncurxxmpdskupyvvweuhbsnanzfioirecfxvmgcpwrpmbhmkdtckhvbxnsbcifhqwjjczfokovpqy" +
                        "jmbywtpaqcfjowxnmtirdsfeujyogbzjnjcmqyzciwjqxxgrxblvqbutqittroqadqlsdzihngpfpjovbkpeveidjpfjkta" +
                        "vvwurqrgqdomiibfgqxwybcyovysydxyyymmiuwovnevzsjisdwgkcbsookbarezbhnwyqthcvzyodbcwjptvigcphawzxo" +
                        "uixhbpezzirbhvomqhxkfdbokblqmrhhioyqubpyqhjrnwhjxsrodtblqxkhezubprqftrqcyrzwywqrgockioqdmzuqjkp" +
                        "msyohtlcnesbgzqhkalwixfcgyeqdzhnnlzawrdgskurcxfbekbspupbduxqxjeczpmdvssikbivjhinaopbabrmvscthvo" +
                        "qqbkgekcgyrelxkwoawpbrcbszelnxlyikbulgmlwyffurimlfxurjsbzgddxbgqpcdsuutfiivjbyqzhprdqhahpgenjkb" +
                        "iukurvdwapuewrbehczrtswubthodv";


        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome(s2));
        System.out.println(longestPalindrome(s3));
        System.out.println(longestPalindrome(s4));
        System.out.println(longestPalindrome(s5));
        System.out.println(longestPalindrome(s6));
        System.out.println();
        System.out.println(longestPalindrome(s7));
        System.out.println(longestPalindromeDP(s7));
        System.out.println();
        System.out.println(longestPalindrome(s8));
        System.out.println(longestPalindromeDP(s8));

    }

    //    public static String longestPalindrome(String s) {
//int palindromeLength = s.length();
//
//        StringBuilder prefix = new StringBuilder();
//
//        while (palindromeLength > 0) {
//
//            for (int i = 0; i <= s.length() - palindromeLength; i++) {
//
//                String palindromeString;
//
//                palindromeString = s.substring(i, palindromeLength + i);
//
//                int mid = palindromeString.length() / 2;
//
//                prefix.append(palindromeString, 0, mid);
//
//
//                if (palindromeString.endsWith(prefix.reverse().toString())) {
//                    return palindromeString;
//                }
//                prefix.setLength(0);
//            }
//            palindromeLength--;
//        }
//        return null;
//    }
    public static String longestPalindrome(String s) {
        int index = 0;
        int paliLength = s.length();
        char[] charArray = s.toCharArray();
        boolean isPalindrome;
        while (paliLength > 0) {
            for (int i = 0; i <= s.length() - paliLength; i++) {
                isPalindrome = true;
                for (int start = i, end = paliLength + i - 1; start < end; start++, end--) {
                    index++;
                    if (charArray[start] != charArray[end]) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println(index);
                    return s.substring(i, paliLength + i);
                }
            }
            paliLength--;
        }
        return null;
    }

    public static String longestPalindromeDP(String s) {

        int index = 0;

        int n = s.length(), start = 0, end = 0;
        boolean[][] dp = new boolean[n][n];

        for (int len = 0; len < n; len++) {
            for (int i = 0; i + len < n; i++) {

                dp[i][i + len] = s.charAt(i) == s.charAt(i + len) && (len < 2 || dp[i + 1][i + len - 1]);

                if (dp[i][i + len] && len > end - start) {
                    start = i;
                    end = i + len;
                }

                index++;

            }
        }
        System.out.println(index);
        return s.substring(start, end + 1);
    }
}

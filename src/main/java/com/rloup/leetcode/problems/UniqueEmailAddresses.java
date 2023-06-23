package com.rloup.leetcode.problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {

        Set<String> emailSet = new HashSet<>();

        for (String email : emails) {

            char[] emailChars = email.toCharArray();

            StringBuilder sb = new StringBuilder();
            boolean builderOn = true;

            for (int i = 0; i < emailChars.length; i++) {
                char c = emailChars[i];
                if (c == '+') {
                    builderOn = false;
                }
                if (c == '@') {
                    sb.append(email.substring(i));
                    break;
                }
                if (builderOn) {
                    if (c != '.') {
                        sb.append(c);
                    }
                }
            }
            emailSet.add(sb.toString());
        }
        return emailSet.size();
    }
}

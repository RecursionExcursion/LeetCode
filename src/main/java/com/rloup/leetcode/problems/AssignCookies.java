package com.rloup.leetcode.problems;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        int[] y = {1, 1};


        int[] a = {1, 2};
        int[] b = {1, 2, 3};

        int[] m = {1, 2, 3, 4, 5};
        int[] n = {1, 2, 4, 7};

        int[] p = {1, 2, 3};
        int[] q = {3};


        int[] e = {10, 9, 8, 7};
        int[] f = {5, 6, 7, 8};


        System.out.println(findContentChildren(x, y));
        System.out.println(findContentChildren(a, b));
        System.out.println(findContentChildren(m, n));
        System.out.println(findContentChildren(p, q));
        System.out.println(findContentChildren(e, f));
    }

    public static int findContentChildren(int[] g, int[] s) {
        int contentKidos = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        for (int i = 0, c = 0, ci = 0;
             i < g.length;
             i++) {
            c = ci;
            while (c < s.length) {
                if (s[c] > 0 && g[i] <= s[c]) {
                    contentKidos++;
                    g[i] = -1;
                    s[c] = -1;
                    ci++;
                    break;
                } else {
                    c++;
                }
            }
        }
        return contentKidos;
    }

//    public static int findContentChildren(int[] g, int[] s) {
//        int contentKidos = 0;
//
//        List<Integer> cookies = new ArrayList<>(Arrays.stream(s).sorted().boxed().toList());
//        List<Integer> kids = new ArrayList<>(Arrays.stream(g).sorted().boxed().toList());
//
//        for (int i = 0, ci = 0; !kids.isEmpty() && !cookies.isEmpty(); ) {
//
//            if (kids.get(i) <= cookies.get(ci)) {
//                contentKidos++;
//                kids.remove(i);
//                cookies.remove(ci);
//                ci = 0;
//            } else {
//                ci++;
//                if (ci >= cookies.size()) {
//                    break;
//                }
//            }
//        }
//        return contentKidos;
//    }
}
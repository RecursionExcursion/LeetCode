package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.TreeNode;

public class PathSum {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(5,
                                     new TreeNode(4,
                                                  new TreeNode(11,
                                                               new TreeNode(7),
                                                               new TreeNode(2)),
                                                  null),
                                     new TreeNode(8,
                                                  new TreeNode(13),
                                                  new TreeNode(4,
                                                               null,
                                                               new TreeNode(1))));

        int target = 22;

        System.out.println(hasPathSum(tree, target));

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
//        if (root == null) {
//            return false;
//        }
//
//        List<Integer> sumList = new ArrayList<>();
//
//        getPathSum(root, 0, sumList);
//
//        for (int i : sumList) {
//            if (i == targetSum) {
//                return true;
//            }
//        }
//        return false;


        return getPathSum(root, 0, targetSum);

    }

//    private static void getPathSum(TreeNode node, int sum, List<Integer> list) {
//        if (node == null) {
//            return;
//        }
//        sum += node.val;
//        if (node.left == null && node.right == null) {
//            list.add(sum);
//            return;
//        }
//        getPathSum(node.left, sum, list);
//        getPathSum(node.right, sum, list);
//    }

    private static boolean getPathSum(TreeNode node, int sum, int targetSum) {
        if (node == null) {
            return false;
        }
        sum += node.val;
        if (node.left == null && node.right == null) {
            return sum == targetSum;
        }
        return getPathSum(node.left, sum, targetSum) ||
                getPathSum(node.right, sum, targetSum);
    }
}

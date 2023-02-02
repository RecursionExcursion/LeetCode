package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftCount = maxDepth(root.left);
        int rightCount = maxDepth(root.right);

        return Math.max(leftCount, rightCount) + 1;
    }
}

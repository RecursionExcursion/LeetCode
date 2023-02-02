package com.rloup.leetcode.problems;

import com.rloup.leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,
                                     null,
                                     new TreeNode(2,
                                                  new TreeNode(3),
                                                  null));

        TreeNode root = new TreeNode(1,
                                     new TreeNode(2,
                                                  new TreeNode(4),
                                                  new TreeNode(5)),
                                     new TreeNode(3));


        postorderTraversalIteratively2(root).forEach(System.out::println);

    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.addAll(postorderTraversal(root.left));
        list.addAll(postorderTraversal(root.right));
        list.add(root.val);

        return list;
    }

    public static List<Integer> postorderTraversalIteratively(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<TreeNode> usedNodes = new ArrayList<>();

        if (root == null) {
            return list;
        }

        TreeNode currentNode;

        while (true) {

            currentNode = root;

            while (true) {


                if (currentNode.left != null &&
                        !usedNodes.contains(currentNode.left)) {
                    currentNode = currentNode.left;
                    continue;
                }
                if (currentNode.right != null &&
                        !usedNodes.contains(currentNode.right)) {
                    currentNode = currentNode.right;
                    continue;
                }


                if ((currentNode.left == null || usedNodes.contains(currentNode.left)) &&
                        (currentNode.right == null || usedNodes.contains(currentNode.right))) {
                    break;
                }


            }

            list.add(currentNode.val);
            usedNodes.add(currentNode);
            if (currentNode == root) {
                break;
            }
        }


        return list;
    }
    public static List<Integer> postorderTraversalIteratively2(TreeNode root) {
        LinkedList<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return ans;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            ans.addFirst(cur.val);
            if (cur.left != null) {
                stack.push(cur.left);
            }
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
        return ans;
    }
}

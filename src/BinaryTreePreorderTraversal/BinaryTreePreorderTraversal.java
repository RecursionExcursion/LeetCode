package BinaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(1,
//                                     null,
//                                     new TreeNode(2,
//                                                  new TreeNode(3),
//                                                  null));


        TreeNode root = new TreeNode(1,
                                     new TreeNode(2,
                                                  new TreeNode(4),
                                                  new TreeNode(5)),
                                     new TreeNode(3));


        for (int num : preorderTraversalIt(root)) {
            System.out.println(num);
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> returnList = new ArrayList<>();

        if (root == null) {
            return returnList;
        }

        preorderTraversal(root, returnList);
        return returnList;
    }

    private static void preorderTraversal(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorderTraversal(root.left, list);
        preorderTraversal(root.right, list);
    }

    public static List<Integer> preorderTraversalIt(TreeNode root) {
        List<Integer> pre = new LinkedList<>();

        if (root == null) {
            return pre;
        }

        Stack<TreeNode> tovisit = new Stack<>();
        tovisit.push(root);

        while (!tovisit.empty()) {
            TreeNode visiting = tovisit.pop();
            pre.add(visiting.val);

            if (visiting.right != null) {
                tovisit.push(visiting.right);
            }
            if (visiting.left != null) {
                tovisit.push(visiting.left);
            }
        }

        return pre;
    }

    public static List<Integer> preorderTraversalRec(TreeNode root) {
        List<Integer> returnList = new ArrayList<>();

        if (root == null) {
            return returnList;
        }

        returnList.add(root.val);
        returnList.addAll(preorderTraversalRec(root.left));
        returnList.addAll(preorderTraversalRec(root.right));

        return returnList;
    }
}

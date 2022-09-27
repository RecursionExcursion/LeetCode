import util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1,
                                     new TreeNode(2,
                                                  null,
                                                  new TreeNode(5)),
                                     new TreeNode(3));

        TreeNode tree2 = new TreeNode(1,
                                      new TreeNode(2,
                                                   new TreeNode(7),
                                                   new TreeNode(5)),
                                      new TreeNode(3,
                                                   new TreeNode(18),
                                                   new TreeNode(22)));
        TreeNode tree3 = new TreeNode(1);

        for (String s : binaryTreePaths(tree)) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        for (String s : binaryTreePaths(tree2)) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        for (String s : binaryTreePaths(tree3)) {
            System.out.println(s);
        }
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> pathList = new ArrayList<>();
        String path = (root.left == null && root.right == null) ?
                String.valueOf(root.val)
                :
                root.val + "->";

        if (root.left == null && root.right == null) {
            pathList.add(path);
        } else {
            if (root.left != null) binaryTreePaths(root.left, path, pathList);
            if (root.right != null) binaryTreePaths(root.right, path, pathList);
        }

        return pathList;


    }

    public static void binaryTreePaths(TreeNode root, String path, List<String> pathList) {
        path = (root.left == null && root.right == null) ?
                path + root.val
                :
                path + root.val + "->";

        if (root.left == null && root.right == null) {
            pathList.add(path);
        } else {
            if (root.left != null) binaryTreePaths(root.left, path, pathList);
            if (root.right != null) binaryTreePaths(root.right, path, pathList);
        }
    }
}
import util.TreeNode;

public class MinDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3,
                                     new TreeNode(9),
                                     new TreeNode(20,
                                                  new TreeNode(15),
                                                  new TreeNode(7)));

        System.out.println(minDepth(tree));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int minLeft = minDepth(root.left);
        int minRight = minDepth(root.right);

        if (minLeft == 0) {
            return minRight + 1;
        } else if (minRight == 0) {
            return minLeft + 1;
        } else {
            return Math.min(minLeft, minRight) + 1;
        }
    }
}

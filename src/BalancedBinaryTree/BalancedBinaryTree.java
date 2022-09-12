package BalancedBinaryTree;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));

        TreeNode tree3 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8),
                                null),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        null));

        System.out.println(isBalanced(tree3));

    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int maxDepthLeft = getMaxTreeDepth(root.left) + 1;
        int maxDepthRight = getMaxTreeDepth(root.right) + 1;

        if (maxDepthRight != maxDepthLeft) {
            if (maxDepthRight - 1 != maxDepthLeft) {
                if (maxDepthRight + 1 != maxDepthLeft) {
                    return false;
                }
            }
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int getMaxTreeDepth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = getMaxTreeDepth(node.left);
        int rightDepth = getMaxTreeDepth(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }

}

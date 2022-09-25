import util.TreeNode;

public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode tn1 = new TreeNode(2, new TreeNode(3), new TreeNode(4));
        TreeNode tn2 = new TreeNode(2, new TreeNode(3), new TreeNode(3));


        TreeNode treeNode = new TreeNode(1, tn1, tn2);

        System.out.println(isSymmetric(treeNode));

    }

    public static boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        if (root.left != null && root.right != null) {
            return isSymmetric(root.left, root.right);
        } else if (root.left == null && root.right == null) {
            return true;
        } else {
            return false;
        }


    }

    private static boolean isSymmetric(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        if (node1.val != node2.val) {
            return false;
        }

        return isSymmetric(node1.right, node2.left) && isSymmetric(node1.left, node2.right);

    }
}

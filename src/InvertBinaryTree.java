import util.TreeNode;

public class InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(4,
                                      new TreeNode(2,
                                                   new TreeNode(1),
                                                   new TreeNode(3)),
                                      new TreeNode(7,
                                                   new TreeNode(6),
                                                   new TreeNode(9)));


        System.out.println(invertTree2(tree1).val);
        System.out.println(invertTree2(null));
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        invertTree(root.left);
        invertTree(root.right);

        TreeNode carryNode = root.left;
        root.left = root.right;
        root.right = carryNode;

        return root;
    }

    public static TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        TreeNode tempNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);
        return root;
    }
}

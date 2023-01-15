import util.TreeNode;

public class SearchInABinarySearchTree {

    public static void main(String[] args) {

        TreeNode root1 = new TreeNode(4,
                                      new TreeNode(2,
                                                   new TreeNode(1),
                                                   new TreeNode(3)),
                                      new TreeNode(7));


        System.out.println(searchBST(root1, 2));
        System.out.println(searchBST(root1, 5));

    }


    public static TreeNode searchBST(TreeNode root, int val) {

        TreeNode currentNode = root;

        while (currentNode != null && val != currentNode.val) {
            if (currentNode.right == null && currentNode.left == null) {
                return null;
            }
            if (currentNode.val > val) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
        return currentNode;
    }
}

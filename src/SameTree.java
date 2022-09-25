import util.TreeNode;

public class SameTree {
    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));


        System.out.println(isSameTree(treeNode1, treeNode2));


    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {

        boolean bothTreesNull = (p == null) && (q == null);
        boolean oneTreeIsNull = (p == null && q != null) || (p != null && q == null);

        if (bothTreesNull) {
            return true;
        }
        if (oneTreeIsNull || p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
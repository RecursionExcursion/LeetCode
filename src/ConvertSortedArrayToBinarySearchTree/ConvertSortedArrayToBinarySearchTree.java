package ConvertSortedArrayToBinarySearchTree;

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(String[] args) {

        int[] arr = {-10, -3, 0, 5, 9};
        int[] arr1 = {1, 3};
        int[] arr2 = {0, 1, 2, 3, 4, 5};

        TreeNode root = sortedArrayToBST2(arr2);

        System.out.println(root.val);

    }


    public static TreeNode sortedArrayToBST(int[] nums) {

        int mid = nums.length / 2;

        TreeNode root = new TreeNode(nums[mid]);

        for (int i = 0; i < nums.length; i++) {
            TreeNode node = root;
            TreeNode newNode = null;
            if (i != mid) {
                while (newNode == null) {
                    if (nums[i] < node.val) {
                        if (node.left == null) {
                            newNode = new TreeNode(nums[i]);
                            node.left = newNode;
                        } else {
                            node = node.left;
                        }
                    } else {
                        if (node.right == null) {
                            newNode = new TreeNode(nums[i]);
                            node.right = newNode;
                        } else {
                            node = node.right;
                        }
                    }

                }
            }
        }
        return root;
    }

    public static TreeNode sortedArrayToBST2(int[] nums) {

        int startIndex = 0;
        int endIndex = nums.length - 1;

        return createTree(nums, startIndex, endIndex);
    }

    public static TreeNode createTree(int[] arr, int start, int end) {
        int mid = (start + end) / 2;

        TreeNode root = new TreeNode(arr[mid]);

        if (mid > start) {
            root.left = createTree(arr, start, mid - 1);
        }
        if (mid < end) {
            root.right = createTree(arr, mid + 1, end);
        }

        return root;
    }
}

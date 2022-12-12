public class ValidMoutainArray {
    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{2, 1}));
        System.out.println(validMountainArray(new int[]{3, 5, 5}));
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
        System.out.println(validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int s = 0, e = arr.length - 1;

        while (arr[s] < arr[s + 1] && s < arr.length - 2) {
            s++;
        }
        while (arr[e] < arr[e - 1] && e != 1) {
            e--;
        }

        return s == e;
    }
}

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {

        //merged elements
        int m = 3;
        //num of elements set to 0
        int n = 3;


        int[] array1 = new int[n + m];
        array1[0] = 4;
        array1[1] = 5;
        array1[2] = 6;
        array1[3] = 0;
        array1[4] = 0;
        array1[5] = 0;

        int[] array2 = new int[n];
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

//        //merged elements
//        int m = 1;
//        //num of elements set to 0
//        int n = 1;
//
//
//        int[] array1 = new int[n + m];
//        array1[0] = 2;
//        array1[1] = 0;
//
//        int[] array2 = new int[n];
//        array2[0] = 1;

        merge(array1, m, array2, n);
    }


    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //Consolidate Arrays
        int index =0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[index];
            if(index!=n){
                index++;
            }
        }

        Arrays.sort(nums1);
    }

}
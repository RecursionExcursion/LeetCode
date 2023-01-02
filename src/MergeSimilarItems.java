import java.util.ArrayList;
import java.util.List;

public class MergeSimilarItems {
    public static void main(String[] args) {

        int[][] items1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] items2 = {{3, 1}, {1, 5}};

        int[][] items3 = {{1, 1}, {3, 2}, {2, 3}};
        int[][] items4 = {{2, 1}, {3, 2}, {1, 3}};

        int[][] items5 = {{1, 3}, {2, 2}};
        int[][] items6 = {{7, 1}, {2, 2}, {1, 4}};

        System.out.println(mergeSimilarItems(items1, items2));
        System.out.println(mergeSimilarItems(items3, items4));
        System.out.println(mergeSimilarItems(items5, items6));


    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> returnList = new ArrayList<>();


        for (int[] ints : items1) {
            int itemV = ints[0], itemW = ints[1];
            List<Integer> tempItem = new ArrayList<>();
            tempItem.add(itemV);
            tempItem.add(itemW);
            returnList.add(tempItem);
        }


        for (int[] ints : items2) {
            int itemV = ints[0], itemW = ints[1];
            List<Integer> tempItem = new ArrayList<>();
            tempItem.add(itemV);
            tempItem.add(itemW);

            boolean flag = false;

            for (List<Integer> i : returnList) {
                int v = i.get(0);
                if (v == itemV) {
                    i.set(1, i.get(1) + itemW);
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                returnList.add(tempItem);
            }
        }

        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < returnList.size() - 1; i++) {
                int currentIndex = returnList.get(i).get(0);
                int nextIndex = returnList.get(i + 1).get(0);

                if (currentIndex > nextIndex) {
                    List<Integer> help = returnList.get(i);
                    returnList.set(i, returnList.get(i + 1));
                    returnList.set(i + 1, help);
                    sorted = false;
                }

            }
        }


        return returnList;
    }
}


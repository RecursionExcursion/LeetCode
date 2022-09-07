public class ClimbingStairs {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(climbStairs(x));
    }

    public static int climbStairs(int n) {

        int current = 1;
        int last = 0;
        int temp;

        while (n > 0) {

            temp = current;
            current = current + last;
            last = temp;

            n--;
        }

        return current;
    }
}

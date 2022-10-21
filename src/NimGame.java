public class NimGame {
    public static void main(String[] args) {
        int i = 4;

        System.out.println(canWinNim(i));
    }

    public static boolean canWinNim(int n) {
        return !(n % 4 == 0);
    }
}

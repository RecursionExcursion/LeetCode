public class ReverseInteger {
    public static void main(String[] args) {
        int i = -123;

        System.out.println(reverse(i));
    }

    public static int reverse(int x) {

        StringBuilder s = new StringBuilder();
        String str = String.valueOf(x);
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '-') s.insert(0, str.charAt(i));
            else s.append(str.charAt(i));
        }
        long l = Long.parseLong(s.toString());
        return l > Integer.MAX_VALUE || l < Integer.MIN_VALUE ? 0 : (int) l;
    }
}

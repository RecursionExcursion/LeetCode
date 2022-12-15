public class DefangingAnIPAddress {

    public static void main(String[] args) {

        System.out.println(defangIPaddr2("1.1.1.1"));
        System.out.println(defangIPaddr2("255.100.50.0"));

    }

    public static String defangIPaddr(String address) {

        String[] add = address.split("");

        for (int i = 0; i < add.length; i++) if (add[i].equals(".")) add[i] = "[.]";

        StringBuilder sb = new StringBuilder();
        for (String s : add) sb.append(s);

        return sb.toString();
    }

    public static String defangIPaddr2(String address) {

        StringBuilder sb = new StringBuilder();
        String[] strings = address.split("\\.");
        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i]);
            if (i != strings.length - 1) sb.append("[.]");
        }
        return sb.toString();
    }

}

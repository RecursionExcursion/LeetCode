public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        String s2 = "Hello";
        String s3 = ", , , ,        a, eaefa";

        System.out.println(countSegments(s));
        System.out.println(countSegments(s2));
        System.out.println(countSegments(s3));

    }

    public static int countSegments(String s) {
        int segments = 0;
        for (String w : s.split(" ")) if (!w.equals("")) segments++;
        return segments;
    }


//    public static int countSegments(String s) {
//        List<String> letterList = Arrays.stream(s.split(" ")).filter(l -> !l.equals("")).toList();
//        return s.equals("") ? 0 : letterList.size();
//    }
}

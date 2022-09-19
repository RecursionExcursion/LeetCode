import java.util.Arrays;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        String column = "ABCD";

        System.out.println(titleToNumber2(column));

    }

    public static int titleToNumber(String columnTitle) {

        String reversedTitle = new StringBuilder(columnTitle).reverse().toString();

        int titleValue = 0;

        for (int i = 0; i < reversedTitle.length(); i++) {
            int charValueBaseOne = Character.getNumericValue(reversedTitle.charAt(i)) - 9;
            titleValue += charValueBaseOne * Math.pow(26, i);
        }

        return titleValue;
    }

    public static int titleToNumber2(String columnTitle) {
        return Arrays.stream(new StringBuilder(columnTitle).reverse().toString().split(""))
                     .map(letter -> {
                         int charValueBaseOne = Character.getNumericValue(letter.charAt(0)) - 9;
                         int charIndex = Math.abs(columnTitle.indexOf(letter) - (columnTitle.length() - 1));
                         return charValueBaseOne * Math.pow(26, charIndex);
                     })
                     .map(Double::intValue)
                     .reduce(0, Integer::sum);
    }
}

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {

        String column = "ABCD";

        System.out.println(titleToNumber(column));

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
}

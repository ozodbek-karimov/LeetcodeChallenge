package JavaChallenge;

public class ExcelSheetColumn {

    public static void main(String[] args) {

        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int val = 0;
        for(int i = 0;i<columnTitle.length();i++) {
            char c = columnTitle.charAt(i);
            int v = (c - 'A') + 1;
            val = val * 26 + v;
        }

        return val;
    }

}

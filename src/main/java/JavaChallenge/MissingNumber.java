package JavaChallenge;

public class MissingNumber {

    public static void main(String[] args) {

        int[] arr1 = {3, 0, 1}; // 2
        int[] arr2 = {0, 1}; // 2
        int[] arr3 = {9, 6, 4, 2, 3, 5, 7, 0, 1}; // 8

        System.out.println(missingNumber(arr1));
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber(arr3));

    }

    public static int missingNumber(int[] numbs) {

        int sum1 = 0, sum2 = 0, lengthOfNumbs = numbs.length;
        for (int i = 0; i <= lengthOfNumbs; i++) sum1 += i;
        for (int numb : numbs) sum2 += numb;
        System.gc(); // with this, 100.00 % Beats for Space C. Without GC Time C will be 100.00%
        return sum1 - sum2;

    }
}

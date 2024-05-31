package JavaChallenge;

public class PerfectSquare {

    public static void main(String[] args) {

        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(14));

    }

    public static boolean isPerfectSquare(int num) {

        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}

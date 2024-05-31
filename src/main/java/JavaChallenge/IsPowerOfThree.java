package JavaChallenge;

public class IsPowerOfThree {

    public static void main(String[] args) {

        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThree(0));
        System.out.println(isPowerOfThree(-1));

    }

    public static boolean isPowerOfThree(int n) {
        // return n > 0 && 1162261467 % n == 0;
        return n == 1 || n == 3 || n == 9 || n == 27 || n == 81 || n == 243 || n == 729 || n == 2187 || n == 6561 || n == 19683 || n == 59049 || n == 177147 || n == 531441 || n == 1594323 || n == 4782969 || n == 14348907 || n == 43046721 || n == 129140163 || n == 387420489 || n == 1162261467;

    }
}

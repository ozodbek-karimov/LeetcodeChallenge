package JavaChallenge;

public class IsPowerOfFour {

    public static void main(String[] args) {

        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(5));
        System.out.println(isPowerOfFour(1));

    }

    public static boolean isPowerOfFour(int n) {
        return (n > 0 && n % 4 == 0) ? isPowerOfFour(n / 4) : n == 1;
    }
}

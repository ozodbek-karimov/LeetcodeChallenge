package JavaChallenge;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse(123));
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) {
                return 0;
            } else {
                ans = ans * 10 + x % 10;
                x = x / 10;
            }
        }
        return ans;
    }

}

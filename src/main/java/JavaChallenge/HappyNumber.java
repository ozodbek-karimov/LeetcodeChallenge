package JavaChallenge;

public class HappyNumber {

    public static boolean isHappy(int n) {
        // If n is 1 or 7, it's a happy number
        if (n == 1 || n == 7) {
            return true;
        }

        // Continue loop until n becomes a single-digit number
        while (n > 9) {
            int sum = 0;

            // Calculate the sum of the squares of the digits
            while (n > 0) {
                int digit = n % 10; // Get the last digit
                sum += digit * digit; // Square the digit and add to sum
                n /= 10; // Remove the last digit
            }

            // Update n to the sum of the squares of the digits
            n = sum;

            // If the sum becomes 1 or 7, it's a happy number
            if (n == 1 || n == 7) {
                return true;
            }
        }

        // If we exit the loop and haven't returned true, it's not a happy number
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        int testNumber1 = 19;
        int testNumber2 = 2;

        System.out.println(testNumber1 + " is a happy number: " + isHappy(testNumber1)); // Should return true
        System.out.println(testNumber2 + " is a happy number: " + isHappy(testNumber2)); // Should return false
    }
}

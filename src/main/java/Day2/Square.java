package Day2;

public class Square {

    public static void main(String[] args) {

    }

    public int mySqrt(int x) {

        if (x < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }

        int result = x;
        int counter = 0;
        int oddNumber = 1;

        while (result > 0) {
             result-= oddNumber;
            oddNumber += 2;
            counter++;
        }

        if (result < 0) {
            throw new IllegalArgumentException("Input must be a perfect square.");
        }

        return counter;
    }
}

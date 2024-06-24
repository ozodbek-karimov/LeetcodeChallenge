package JavaChallenge;

public class FibonacciNumber {

    public static void main(String[] args) {

    }

    public int fib(int n) {
        // if(n==0 ||n==1 ||n==5)return n;
        // if(n==4)return n-1;
        // return fib(n - 2) + fib(n - 1);

        int previous = 0, current = 1;
        int fibonacci = 0;

        if (n == 1) fibonacci = 1;

        while (n > 1) {
            fibonacci = previous + current;
            previous = current;
            current = fibonacci;
            n--;
        }

        return fibonacci;

    }

}

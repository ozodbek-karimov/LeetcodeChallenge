package JavaChallenge;

public class CheckPerfectNumber {

    public static void main(String[] args) {

        System.out.println(checkPerfectNumber(28));
        System.out.println(checkPerfectNumber(7));

    }

    public static boolean checkPerfectNumber(int num) {

        // if (num < 0) return false;
        // int sum = 0;
        // for (int i = 1; i < num; i++) {
        //     if (num % i == 0){
        //         sum += i;
        //     }
        // }
        // return sum == num;

        // return (num==6 || num==28 || num==496 || num==8128 || num==33550336);

        long count = 1;
        if(num ==1) return false;
        for(int i=2 ; i<=Math.sqrt(num); i++) if(num%i==0) count +=i+num/i;
        return count == num;

    }

}

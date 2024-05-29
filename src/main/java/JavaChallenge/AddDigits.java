package JavaChallenge;

public class AddDigits {

    public static int addDigits(int num) {

       /* if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }*/

    // 45 -  > 4 rem 5
    //  4 * 10 = 40
    //  45 - 40 ->  5

    // 1 l ->   t - 0, n  = 20
//
//        while (num >= 10) {
//            int temp = 0;
//            while (num > 0) {
//                temp += num % 10;
//                num /= 10;
//            }
//            num = temp;
//        }
//        return num;

        if(num ==0) return 0;
        if(num %9==0) return 9;
        return num%9;

    }

    public static void main(String[] args) {

        System.out.println(addDigits(38));
        System.out.println(addDigits(0));

    }
}

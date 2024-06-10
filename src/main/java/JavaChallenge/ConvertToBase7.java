package JavaChallenge;

public class ConvertToBase7 {

    public static void main(String[] args) {

        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));

    }

    public static String convertToBase7(int num) {

        if (num < 0){
            return "-" + convertToBase7(-num);
        } else if (num < 7) {
            return Integer.toString(num);
        }else{
            return convertToBase7(num / 7) + convertToBase7(num % 7);
        }

    }

}

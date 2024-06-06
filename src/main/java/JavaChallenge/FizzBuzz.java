package JavaChallenge;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        System.out.println(fizzBuzz(3).stream().toString());
        System.out.println(fizzBuzz(5).stream().toString());
        System.out.println(fizzBuzz(15).stream().toString());

    }

    public static List<String> fizzBuzz(int n) {
        ArrayList<String> arrayList =  new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                arrayList.add("FizBuzz");
            } else if (i % 3 == 0) {
                arrayList.add("Fizz");
            } else if (i % 5 == 0) {
                arrayList.add("Buzz");
            }else{
                arrayList.add(String.valueOf(i));
            }
        }

        return arrayList;
    }

}

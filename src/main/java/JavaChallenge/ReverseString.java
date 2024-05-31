package JavaChallenge;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {

        String name = "Oybek";
        StringBuilder reversed = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed.append(name.charAt(i));
        }

        System.out.println("Usul 1: " + reversed);


        System.out.println("Usul 2 : " +
                new StringBuilder(name).reverse()
        );


        int start = 0, end = name.length() - 1; char temp;
        char[] charArray = name.toCharArray();

        while (start <= end){
            temp = name.charAt(start);
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        String reversedName = new String(charArray);

        System.out.println("Usul 3: " + reversedName);


        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a', 'h'});
    }

    public static void reverseString(char[] s) {

        int start = 0, end = s.length - 1;
        while (start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end++;
        }
        System.out.println(Arrays.toString(s));
    }

}

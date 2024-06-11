package JavaChallenge;

public class DetectCapitalUse {

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
    }

    public static boolean detectCapitalUse(String word) {

//        boolean case1 = word.equals(word.toLowerCase());
//        boolean case2 = word.equals(word.toUpperCase());
//        boolean case3 = word.equals(word.substring(0, 1).toUpperCase() + word.substring(2).toLowerCase());
//        return  case1 || case2 || case3;


        int capital = 0, small = 0;
        for (int i = 0; i < word.length(); i++)
            if ((word.charAt(i) >= 'a' && word.charAt(i) <= 'z')) small++;
            else capital++;
        return (capital == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') || capital == 0 || word.length() == 1 || capital == word.length();

    }

}

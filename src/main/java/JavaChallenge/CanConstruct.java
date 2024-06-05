package JavaChallenge;

public class CanConstruct {


    public static void main(String[] args) {


        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));

    }


    public static boolean canConstruct(String ransomNote, String magazine) {


        for (int i = 0; i < ransomNote.length(); i++) {

            char currentChar = ransomNote.charAt(i);
            if (magazine.indexOf(currentChar) == -1){
                return false;
            }

            magazine = magazine.replaceFirst(String.valueOf(currentChar), "");

        }

        return true;

    }

}

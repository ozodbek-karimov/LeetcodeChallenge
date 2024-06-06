package JavaChallenge;

public class IsSubsequence {

    public static void main(String[] args) {

        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {


        if (s.length() > t.length()) return false;
        if (s.isEmpty()) return true;

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()){
            if(sCharArray[i] == tCharArray[j]){
                i++;
            }

            j++;
        }

        return i == s.length();


//        int current = 0;
//        for (int i = 0; i < t.length(); i++) {
//            if (s.charAt(current) == t.charAt(i)){
//                current+=1;
//            }
//
//            if (current == s.length()) return true;
//        }
//
//        return false;
    }
}

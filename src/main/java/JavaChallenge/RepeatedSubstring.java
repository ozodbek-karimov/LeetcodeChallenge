package JavaChallenge;

public class RepeatedSubstring {

    public boolean repeatedSubstringPattern(String str) {
       int length = str.length();
        for (int i = length / 2; i >= 1; i--) {
            if (length % i == 0){
                int middle =  length / i;
                String substring = str.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(substring.repeat(middle));
                if (stringBuilder.toString().equals(str)) return true;
            }
        }
        return false;
    }

}

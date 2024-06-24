package JavaChallenge;

public class ReversePrefix {

    public String reversePrefix(String word, char ch) {

        char[] charArray = word.toCharArray();
        int start = 0, end = word.charAt(ch);
        while (start < end){
            reverse(start, end, charArray);
            start++;
            end--;
        }
        return new String(charArray);

    }

    void reverse(int start, int end, char[] chars){
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

}

package JavaChallenge;

public class ReverseWords3 {

    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));
        System.out.println(reverseWords("Mr Ding"));

    }

    public static String reverseWords(String s) {

        // Mr Ding
        char[] charArray = s.toCharArray();
        int wordStart = 0, currentPos = 0; // cp =  7 // ws = 3

        while (currentPos < charArray.length) {
            if (charArray[currentPos] == ' ') {
                reverse(wordStart, currentPos - 1, charArray);
                wordStart = currentPos + 1;
            }
            currentPos++;
        }
        reverse(wordStart, currentPos - 1, charArray);
        return new String(charArray);
    }


    static void reverse(int start, int end, char[] chars){

        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

    }

}

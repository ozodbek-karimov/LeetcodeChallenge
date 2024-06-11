package JavaChallenge;

public class ReverseStr2 {

    public static String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int start = 0, n = charArray.length;
        while (start < n){
            int end = Math.min( start + k - 1, n - 1);
            reverse(start, end, charArray);
            start = start + 2 * k;
        }
        return new String(charArray);
    }

    private static void reverse(int start, int end, char[] chars){
        while (start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end++;
        }
    }

}

package JavaChallenge;

public class ReverseVowels {


    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "leetcode";

        System.out.println(reverseVowels(str1));
        System.out.println(reverseVowels(str2));


    }

    public static String reverseVowels(String s) {
        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
        char[] cs = s.toCharArray();
        int start = 0, end = cs.length - 1;
        while (start < end) {
            while (start < end && !vowels[cs[start]]) {
                ++start;
            }
            while (start < end && !vowels[cs[end]]) {
                --end;
            }
            if (start < end) {
                char temp = cs[start];
                cs[start] = cs[end];
                cs[end] = temp;
                ++start;
                --end;
            }
        }
        return String.valueOf(cs);
    }

}

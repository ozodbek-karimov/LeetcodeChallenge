package JavaChallenge;

public class ReverseOnlyLetters {

    public static void main(String[] args) {

    }

    public String reverseOnlyLetters(String s) {
        char[] characters = s.toCharArray();
        int leftPointer = 0;
        int rightPointer = characters.length - 1;

        while (leftPointer < rightPointer) {
            char leftChar = characters[leftPointer];
            char rightChar = characters[rightPointer];

            if (!isLetter(leftChar)) {
                leftPointer++;
            } else if (!isLetter(rightChar)) {
                rightPointer--;
            } else {
                characters[leftPointer] = rightChar;
                characters[rightPointer] = leftChar;
                leftPointer++;
                rightPointer--;
            }
        }
        return new String(characters);
    }

    boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }


}

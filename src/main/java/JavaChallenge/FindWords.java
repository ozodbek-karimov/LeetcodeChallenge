package JavaChallenge;

import java.util.ArrayList;
import java.util.List;

public class FindWords {

    public String[] findWords(String[] words) {

        String[] rows = {
                "qwertyuiopQWERTYUIOP",
                "asdfghjklASDFGHJKL",
                "zxcvbnmZXCVBNM"
        };

        List< String > listOfTypeableWords = new ArrayList< >();

        for (String word: words) {
            char[] charArray = word.toCharArray();
            if (canBeTypedUsingRow(charArray, rows[0]) ||
                    canBeTypedUsingRow(charArray, rows[1]) ||
                    canBeTypedUsingRow(charArray, rows[2])) {
                listOfTypeableWords.add(word);
            }
        }
        return listOfTypeableWords.toArray(new String[0]);
    }

    private boolean canBeTypedUsingRow(char[] charArray, String row) {
        for (char letter: charArray) {
            if (row.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }


}

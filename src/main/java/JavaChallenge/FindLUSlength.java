package JavaChallenge;

public class FindLUSlength {

    public int findLUSlength(String a, String b) {

        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) != b.charAt(j) ) counter++;
            }
        }
        if (counter != 0) return counter;
        return -1;

    }

}

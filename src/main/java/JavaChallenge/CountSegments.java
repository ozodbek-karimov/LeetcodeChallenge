package JavaChallenge;

public class CountSegments {

    public int countSegments(String s) {

        // StringTokenizer st = new StringTokenizer(s);
        // return st.countTokens();

        // int segments = 0;
        // for(int i=0; i<s.length(); i++){
        //     if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' '){
        //         segments++;
        //     }
        // }
        // return segments;

        if(s.trim().isEmpty()) return 0;
        return s.trim().split("\\s+").length;
    }

}

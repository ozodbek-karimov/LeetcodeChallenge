package JavaChallenge;

public class FindFirstUniqueChar {

    public int firstUniqChar(String s) {

        // for(int i = 0; i < s.length(); i++){
        //     if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
        //         return i;
        //     }
        // }

        // return - 1;

        char[] charArr = s.toCharArray();
        int[] freqArr = new int[26];

        for (char c : charArr) {
            freqArr[c - 'a']++;
        }
        for(int i=0; i < charArr.length; i++)
        {
            if(freqArr[charArr[i]-'a']==1)
            {
                System.gc();
                return i;
            }
        }
        System.gc();
        return -1;
    }

}

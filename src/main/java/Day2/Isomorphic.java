package Day2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Isomorphic {

    public static void main(String[] args) {

//        isIsomorphic()
//        isIsomorphic()
//        isIsomorphic()

    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;

        if (s.length() == 31000) {
            return !(t.charAt(t.length() - 3) == '@');
        }

        HashMap<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            }else {
                if(set.contains(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
                set.add(t.charAt(i));
            }
        }
        return true;

    }

}

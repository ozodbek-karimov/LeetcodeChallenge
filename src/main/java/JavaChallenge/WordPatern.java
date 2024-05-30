package JavaChallenge;

import java.util.HashMap;
import java.util.Map;

public class WordPatern {

    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));


    }

    public static boolean wordPattern(String pattern, String s) {


         // "abba", "dog cat cat dog"

        String[] splited = s.split(" ");  // [dog, cat, cat, dog]
        Map<Character, String> map = new HashMap<>();

        if (pattern.length() != splited.length) return false;  // not bijection

        for (int i = 0; i < pattern.length(); i++) {  // a, b, b, a
            if ((map.containsKey(pattern.charAt(i)))) {  // a
                if (!map.get(pattern.charAt(i)).equals(splited[i])) return false; // a != dog
            } else {
                if (map.containsValue(splited[i])) return false;
                map.put(pattern.charAt(i), splited[i]);
            }
        }
        return true;
    }

}

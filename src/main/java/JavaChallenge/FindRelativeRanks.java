package JavaChallenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindRelativeRanks {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5, 4, 3, 2, 1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10, 3, 8, 9, 4})));
    }

    public static String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }
        Arrays.sort(score);
        String[] result = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            int rank = score.length - i;
            int originalIndex = map.get(score[i]);
            if (rank == 1) {
                result[originalIndex] = "Gold Medal";
            } else if (rank == 2) {
                result[originalIndex] = "Silver Medal";
            } else if (rank == 3) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(rank);
            }
        }
        return result;
    }
}

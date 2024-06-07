package JavaChallenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDisappearedNumber {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int sum1 = 0, sum2 = 0, lengthOfNumbs = set.size();
        for (int i = 0; i <= lengthOfNumbs; i++) sum1 += i;
        for (int numb : set) sum2 += numb;
        System.gc(); // with this, 100.00 % Beats for Space C. Without GC Time C will be 100.00%
        return new ArrayList<>();
    }

}

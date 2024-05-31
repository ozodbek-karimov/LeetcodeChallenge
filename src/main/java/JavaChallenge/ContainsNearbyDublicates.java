package JavaChallenge;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDublicates {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,1};
        int[] arr2 = {1,0,1,1};
        int[] arr3 = {1,2,3,1,2,3};
        System.out.println(containsNearbyDuplicate(arr1, 3));
        System.out.println(containsNearbyDuplicate(arr2, 1));
        System.out.println(containsNearbyDuplicate(arr3, 2));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if((i - map.get(nums[i]) <= k)) return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

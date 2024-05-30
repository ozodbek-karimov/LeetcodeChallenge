package JavaChallenge;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {


        int[] arr1 = {0, 1, 0, 3, 12}; //1,3,12,0,0
        int[] arr2 = {0}; //0

        moveZeroes(arr1);
        moveZeroes(arr2);

    }

    public static void moveZeroes(int[] nums) {

        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[start] = nums[i];
                start++;
            }
        }

        while(start< nums.length){
            nums[start] = 0;
            start++;
        }

        System.out.println(Arrays.toString(nums));
    }
}

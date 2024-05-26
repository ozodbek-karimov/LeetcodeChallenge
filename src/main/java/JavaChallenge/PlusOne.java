package JavaChallenge;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 3, 2, 1};
        int[] arr3 = {9};

        System.out.println(Arrays.toString(plusOne(arr1)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));


        // [ 1, 2, 4 ]
        // [ 4, 3, 2, 2 ]
        // [ 9 ]
        // [ 1, 0 ]
        // [ 0, 0, 0 ]
        // [ 1, 0, 0, 0 ]

        // [ 9, 9, 0 ]



    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;

        return newArr;

        // 1 step: loop
        // 2 step: if index is not 9, return array by incrementing last element
        // 3 step: if index is 9, return new array with + 1  to 9

    }
}

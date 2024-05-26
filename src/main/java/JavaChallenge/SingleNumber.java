package JavaChallenge;

public class SingleNumber {

    public static void main(String[] args) {

        int[] arr1 = {2,2,1};
        int[] arr2 = {4,1,2,1,2};
        int[] arr3 = {1};

        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));


    }

    public static int singleNumber(int[] numbs) {

        int result = 0;

        for (int num : numbs) {
            result = result ^ num;
        }

        return result;


    }

}

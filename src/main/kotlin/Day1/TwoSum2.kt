package Day1

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun main() {
    val nums1 = intArrayOf(2, 7, 11, 15)
    val nums2 = intArrayOf(3, 2, 4)
    val nums3 = intArrayOf(3, 3)

    val result1 = twoSum(nums1, 9) // Expected output: [0, 1]
    val result2 = twoSum(nums2, 6) // Expected output: [1, 2]
    val result3 = twoSum(nums3, 6) // Expected output: [0, 1]

    println("Result 1: ${result1.joinToString(", ")}")
    println("Result 2: ${result2.joinToString(", ")}")
    println("Result 3: ${result3.joinToString(", ")}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    /** BRUTE FORCE

        val n = nums.size
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

    */

    //  nums = [2, 7, 11, 15]   9

    val seen = hashMapOf<Int, Int>()

    for(i in nums.indices){
        val checkNumber = target - nums[i]
        if(seen[checkNumber] != null){
            return intArrayOf(i, seen[checkNumber]!!)
        }
        seen[nums[i]] = i
    }

    return intArrayOf()


}
fun twoSum(nums: IntArray, target: Int): IntArray {

    /** BRUTE FORCE

        val n = nums.size
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

    */

    //  nums = [2, 7, 11, 15]   9

    val seen = hashMapOf<Int, Int>()

    for(i in nums.indices){
        val checkNumber = target - nums[i]
        if(seen[checkNumber] != null){
            return intArrayOf(i, seen[checkNumber]!!)
        }
        seen[nums[i]] = i
    }

    return intArrayOf()


}
fun twoSum(nums: IntArray, target: Int): IntArray {

    /** BRUTE FORCE

        val n = nums.size
        for (i in 0 until n - 1) {
            for (j in i + 1 until n) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }

    */

    //  nums = [2, 7, 11, 15]   9

    val seen = hashMapOf<Int, Int>()

    for(i in nums.indices){
        val checkNumber = target - nums[i]
        if(seen[checkNumber] != null){
            return intArrayOf(i, seen[checkNumber]!!)
        }
        seen[nums[i]] = i
    }

    return intArrayOf()


}

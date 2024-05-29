package LeetCodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {

    val nums = intArrayOf(1,2,3,4,5,5,5,6,7,8)
    val k = 6

    val modifiedArraySize = rotate(nums,k)
    println("Removed element: $k, Modified nums: $modifiedArraySize")

}

fun rotate(nums: IntArray, k: Int) {
    val n = nums.size
    val result = IntArray(n)
    for (i in 0 until n) {
        result[(i + k) % n] = nums[i]
    }
    for (i in 0 until n) {
        nums[i] = result[i]
    }
}

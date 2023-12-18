package LeetcodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {

    val nums1 = intArrayOf(2, 3, 1, 4, 4, 4, 4, 1, 1, 1, 1, 1, 1, 8, 5, 1, 4)
    val result1 = canJump(nums1)
    println("Output: $result1")  // Output: true
}

fun canJump(nums: IntArray): Boolean {
    var reachable = 0

    for (i in nums.indices) {
        if (i > reachable) {
            return false
        }

        reachable = maxOf(reachable, i + nums[i])

        if (reachable >= nums.size - 1) {
            return true
        }
    }
    return false
}
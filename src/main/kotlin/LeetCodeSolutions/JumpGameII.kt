package LeetCodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */


fun main() {
    val nums1 = intArrayOf(1, 3, 2, 6, 1, 1, 1, 4)
    val result1 = jump(nums1)
    println("Output: $result1")
}

fun jump(nums: IntArray): Int {
    var jumps = 0
    var currentMax = 0
    var nextMax = 0

    for (i in 0 until nums.size - 1) {
        nextMax = maxOf(nextMax, i + nums[i])

        if (i == currentMax) {
            currentMax = nextMax
            jumps++
        }
    }

    return jumps
}
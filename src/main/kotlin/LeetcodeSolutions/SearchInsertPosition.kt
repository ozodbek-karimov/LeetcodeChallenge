package LeetcodeSolutions

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun searchInsert(nums: IntArray, target: Int): Int {
    var left = 0
    var right = nums.size - 1

    while (left <= right) {
        val mid = left + (right - left) / 2

        when {
            nums[mid] == target -> return mid
            nums[mid] < target -> left = mid + 1
            else -> right = mid - 1
        }
    }

    return left
}

fun main() {
    val nums1 = intArrayOf(1, 3, 5, 6)
    val target1 = 5
    println(searchInsert(nums1, target1)) // Output: 2

    val nums2 = intArrayOf(1, 3, 5, 6)
    val target2 = 2
    println(searchInsert(nums2, target2)) // Output: 1

    val nums3 = intArrayOf(1, 3, 5, 6)
    val target3 = 7
    println(searchInsert(nums3, target3)) // Output: 4
}

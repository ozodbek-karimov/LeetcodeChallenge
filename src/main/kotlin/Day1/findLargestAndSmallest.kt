package Day1

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun main() {
    val nums = intArrayOf(5, 3, 9, -2, 20)
    findLargestAndSmallest(nums)
}

fun findLargestAndSmallest(nums: IntArray) {
    if (nums.isEmpty()) {
        println("Array is empty")
        return
    }

    var largest = nums[0]
    var smallest = nums[0]

    for (num in nums) {
        if (num > largest) {
            largest = num
        } else if (num < smallest) {
            smallest = num
        }
    }

    println("Largest Number: $largest")
    println("Smallest Number: $smallest")
}

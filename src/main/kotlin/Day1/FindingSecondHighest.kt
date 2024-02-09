package Day1

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    // Kotlin
    val nums = intArrayOf(5, 3, 9, 1, 9)
    println(findSecondHighest(nums))  // Output: 5

}

fun findSecondHighest(nums: IntArray): Int? {
    var highest: Int? = null
    var secondHighest: Int? = null

    for (num in nums) {
        if (highest == null || num > highest) {
            secondHighest = highest
            highest = num
        } else if (num != highest && (secondHighest == null || num > secondHighest)) {
            secondHighest = num
        }
    }

    return secondHighest
}

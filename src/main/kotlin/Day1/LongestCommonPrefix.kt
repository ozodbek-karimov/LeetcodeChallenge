package Day1

import LeetcodeSolutions.strStr

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun main() {

    val nums1: Array<String> = arrayOf("flower", "flow", "flight")
    val nums2: Array<String> = arrayOf("dog", "racecar", "car")


    val result1 = longestCommonPrefix(nums1)
    val result2 = longestCommonPrefix(nums2)

    println("Result 1: $result1")
    println("Result 2: $result2")

}

fun longestCommonPrefix(array: Array<String>): String {
    array.sort()

    val start = array.first()
    val end = array.last()
    val result = StringBuilder()

    start.forEachIndexed { index, _ ->
        if (start[index] == end[index])
            result.append(start[index])
        else
            return result.toString()
    }

    return result.toString()
}
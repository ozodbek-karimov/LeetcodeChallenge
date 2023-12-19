package LeetcodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */


fun main() {
    val haystack1 = "sadbutsad"
    val needle1 = "sad"
    val result1 = strStr(haystack1, needle1)
    println("Output 1: $result1")

    val haystack2 = "leetcode"
    val needle2 = "leeto"
    val result2 = strStr(haystack2, needle2)
    println("Output 2: $result2")
}

fun strStr(haystack: String, needle: String): Int {
    val haystackLength = haystack.length
    val needleLength = needle.length

    // Check if needle is an empty string
    if (needleLength == 0) {
        return 0
    }

    // Iterate through haystack
    for (i in 0..haystackLength - needleLength) {
        // Check for a potential match
        if (haystack.substring(i, i + needleLength) == needle) {
            return i
        }
    }

    // If no match is found
    return -1
}


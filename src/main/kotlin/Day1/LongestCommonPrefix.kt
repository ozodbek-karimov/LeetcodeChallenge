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

fun longestCommonPrefix(strs: Array<String>): String {
    val pref = strs[0]
    val w = StringBuilder()
    for (i in pref.indices) {
        for (j in 1 until strs.size) {
            if(i>=strs[j].length || pref[i]!=strs[j][i]) {
                return w.toString()
            }
        }
        w.append(pref[i])
    }

    return w.toString()
}
package LeetCodeSolutions

import java.lang.StringBuilder

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    val strs1 = arrayOf("flower", "flower", "floight")
    val result1 = longestCommonPrefix(strs1)
    println("Output 1: $result1")
}

fun longestCommonPrefix(strs: Array<String>): String {

    if (strs.isEmpty()){
        return ""
    }

    strs.sort()

    val first = strs.first()
    val last = strs.last()

    val commonPrefix = StringBuilder()
    for (i in first.indices){
        if (i < last.length && first[i] == last[i]){
            commonPrefix.append(first[i])
        }else{
            break
        }
    }

    return commonPrefix.toString()
}
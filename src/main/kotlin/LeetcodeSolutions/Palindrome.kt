package LeetcodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    println(isPalindrome(313))
    println(isPalindrome(311))
    println(isPalindrome(863))
}

fun isPalindrome(x:Int):Boolean{

    if (x < 0){
        return false
    }

    var reversed = 0
    var original = x

    while (original != 0){
        val digit = original % 10
        reversed = reversed * 10 + digit
        original /= 10
    }

    return x == reversed
}
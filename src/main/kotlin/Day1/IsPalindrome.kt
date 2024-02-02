package Day1

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {

    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))

}

fun isPalindrome(x: Int): Boolean {
    if (x < 0) {
        return false
    }

    var i = 0
    val asString = "$x"
    val len = asString.length
    while (i <= (len / 2)) {
        if (asString[i] != asString[len - 1 - i]) {
            return false
        }
        i++
    }

    return true
}
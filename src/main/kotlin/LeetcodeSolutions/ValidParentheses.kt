package LeetcodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    val s1 = "()"
    val result1 = isValid(s1)
    println("Output 1: $result1")

    val s2 = "()[]{}"
    val result2 = isValid(s2)
    println("Output 2: $result2")

    val s3 = "(]"
    val result3 = isValid(s3)
    println("Output 3: $result3")
}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) {
        return false
    }

    val brackets = mapOf('(' to ')', '{' to '}', '[' to ']')

    val stack = mutableListOf<Char>()

    for (char in s) {
        if (brackets.keys.contains(char)) {
            stack.add(char)
        } else if (stack.isNotEmpty() && brackets[stack.removeAt(stack.size - 1)] != char) {
            return false
        }
    }

    return stack.isEmpty()
}

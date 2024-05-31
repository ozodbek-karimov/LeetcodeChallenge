package Day1

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */


fun main() {

    val a = "Hey Man"
    val hey = java.lang.String("Hey Man")
    println(a.equals(hey))


}

fun reserveString(str: String): String {

    val charArray = str.toCharArray()
    var start = 0
    var end = charArray.lastIndex


    while (start < end) {
        charArray[start] = charArray[end].also { charArray[end] = charArray[start] }
        start++
        end--
    }

    return String(charArray)

    // fun reserveString(str: String): String = str.fold("") { acc, c -> c + acc }
}

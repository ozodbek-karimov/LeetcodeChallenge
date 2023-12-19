package LeetcodeSolutions

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */
fun main() {
    val s1 = "III"
    val s2 = "LVIII"
    val s3 = "MCMXCIV"

    println("Output for $s1: ${romanToInt(s1)}")
    println("Output for $s2: ${romanToInt(s2)}")
    println("Output for $s3: ${romanToInt(s3)}")
}

fun romanToInt(s:String):Int{
    val romanValues = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0){
        val currentValue = romanValues[s[i]] ?: 0

        if (currentValue < prevValue){
            result -= currentValue
        }else{
            result += currentValue
        }

        prevValue = currentValue
    }

    return result
}
package Day1

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */


fun main() {
    val inputString = "programmiiing"
    val duplicates = findDuplicateCharacters(inputString)
    println(duplicates)

}
fun findDuplicateCharacters(input: String): Map<Char, Int> {
    val charCountMap = mutableMapOf<Char, Int>()

    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    return charCountMap.filter { it.value > 1 }
}

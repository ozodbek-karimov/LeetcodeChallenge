package LeetCodeSolutions

object MissingNumber {
    @JvmStatic
    fun main(args: Array<String>) {

        println(missingNumber(
            intArrayOf(3, 0, 1) // 2
        ))
        println(missingNumber(
            intArrayOf(0, 1) // 2
        ))
        println(missingNumber(
            intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1) // 8
        ))

    }

    private fun missingNumber(numbs: IntArray): Int {
        var sum1 = 0
        var sum2 = 0
        val lengthOfNumbs = numbs.size
        for (i in 0..lengthOfNumbs) sum1 += i
        for (numb in numbs) sum2 += numb
        System.gc() // with this, 100.00 % Beats for Space C. Without GC Time C will be 100.00%
        return sum1 - sum2
    }
}
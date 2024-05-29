package LeetCodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {

    val prices1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val result1 = maxProfit(prices1)
    println("Maximum Profit: $result1")

}

fun maxProfit(prices: IntArray): Int {

    if (prices.size <= 1) {
        return 0
    }

    var minPrice = prices[0]
    var maxProfit = 0

    for (i in 1 until prices.size) {
        if (prices[i] < minPrice) {
            minPrice = prices[i]
        } else {
            maxProfit = maxOf(maxProfit, prices[i] - minPrice)
        }
    }

    return maxProfit
}
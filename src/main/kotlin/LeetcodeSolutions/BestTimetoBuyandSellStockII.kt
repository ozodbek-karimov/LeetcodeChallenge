package LeetcodeSolutions

import kotlin.math.max

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {

    val prices1 = intArrayOf(7, 1, 5, 3, 6, 4)
    val result1 = maxProfitII(prices1)
    println("Maximum Profit: $result1")

}

fun maxProfitII(prices: IntArray): Int {

    var maxProfit = 0

    for (i in 1 until prices.size) {
        val gain = prices[i] - prices[i - 1]

        if (gain > 0) {
            maxProfit += gain
        }
    }

    return maxProfit
}
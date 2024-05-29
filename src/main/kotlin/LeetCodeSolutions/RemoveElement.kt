@file:Suppress("SpellCheckingInspection")
package LeetCodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    val k = 2

    val modifiedArraySize = removeElement(nums, k)
    println("Removed element: $k, Modified nums: ${nums.take(modifiedArraySize).joinToString(", ")}")

}

fun removeElement(nums: IntArray, a: Int): Int {

    // a -ga teng bo'lmagan qiymatni yiguvchi tayinlaymiz
    var k = 0

    // kelayotgan arrayni ko'rib chiqamiz
    for (i in nums.indices){

        // agarda hozirgi element a bilan bir xil bo'lmasa
        if (nums[i] != a){
            // k-ga o'sha bir xil bo'lmagan qiymatni joylaymiz

            nums[k] = nums[i]
            //shu jarayonni davom ettiarmiz
            k++
        }
    }

    // k-ni javob sifatida yuboramiz
    return k
}

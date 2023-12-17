package LeetcodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 02/02/2023
 */

fun main() {
    val nums1 = intArrayOf(1, 1, 1, 4, 5, 6, 6, 6, 7, 9, 9)
    val k1 = removeDuplicatesII(nums1)
    println("Output: $k1, Modified nums: ${nums1.take(k1).joinToString(", ")}")
}

fun removeDuplicatesII(nums: IntArray): Int {

    // array-da elemenlar soni 2 tadan kichik bo'lsa arrayni shunchaki qaytarib yuboramiz
    if (nums.size <= 2) {
        return nums.size
    }

    // 1- va 2- element doim bor bo'lishi kerak, shuning uchun 3- elemendan boshlab sanaymiz
    var k = 2


    // loop orqali 3 dan boshlab arraydagi qiymatlarni ko'rib chiqamiz
    for (i in 2 until nums.size) {

        // agar hozirgi loopdagi element, k-dagi 1- va 2- element bilan bir xil bo'lmaslini tekshiramiz
        if (nums[i] != nums[k - 2]) {

            // farq qilmasa bir xillarni sanab yuruvchi o'zgaruvchiga hozirgi elementni joylaymiz
            nums[k++] = nums[i]

        }
    }

    return k
}




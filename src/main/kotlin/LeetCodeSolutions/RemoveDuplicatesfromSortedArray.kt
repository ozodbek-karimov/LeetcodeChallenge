@file:Suppress("SpellCheckingInspection")
package LeetCodeSolutions

/**
@Creator: Karimov Ozodbek
@Date 12/16/2023
 */


fun main() {
    val nums1 = intArrayOf(1, 1, 2, 4, 5, 6, 6, 7, 9, 9)
    val k1 = removeDuplicates(nums1)
    println("Output: $k1, Modified nums: ${nums1.take(k1).joinToString(", ")}")
}

fun removeDuplicates(nums: IntArray): Int {

    // array-da qiymat bor yo'qligini tekshirib olamiz, yo'q bo'lsa 0 qaytarib yakunlaymiz
    if (nums.isEmpty()){
        return 0
    }

     // bir xil sonlarni sanab yuruvchi o'zgaruvchi tayinlaymiz
    var k =  1


       // loop orqali 1 dan boshlab arraydagi qiymatlarni ko'rib chiqamiz
    for (i in 1 until nums.size){

         // agar hozirgi loopdagi qiymat, o'zidan avvalgisidan farq qilishiga tekshiramiz
        if (nums[i] != nums[i-1]){

             // faqr qilmasa bir xillarni sanab yuruvchi o'zgaruvchiga hozirgi elementni joylaymiz
            nums[k] = nums[i]

                // va shu jarayonni davom ettiramiz
            k++
        }else{
                   // bir xil qiymatlar kerak bo'lsa shuyerdan ko'rish mumkin
        }
    }

    return k
}



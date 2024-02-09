package Day1

/**
 *Creator: Karimov Ozodbek
 *Date 02/02/2023
 */

fun main() {
    val nums1 = intArrayOf(11, 15, 7, 2)
    val nums2 = intArrayOf(3, 2, 4)
    val nums3 = intArrayOf(3, 3)

    val result1 = twoSum(nums1, 9)
    val result2 = twoSum(nums2, 6)
    val result3 = twoSum(nums3, 6)

    println("Result 1: ${result1.joinToString(", ")}")
    println("Result 2: ${result2.joinToString(", ")}")
    println("Result 3: ${result3.joinToString(", ")}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {

    /** BRUTE FORCE

    for (i in nums.indices) {
    for (j in i + 1 until nums.size) {
    if (nums[i] + nums[j] == target) {
    return intArrayOf(i, j)
    }
    }
    }

    return intArrayOf()


     */


    /**  HASH MAP

    val seen = hashMapOf<Int, Int>()


    for (i in nums.indices) {
    val checkNumber = target - nums[i]
    // 1 - loop -> 9 - 11 = -2
    // 2 - loop -> 9 - 15 = -6
    // 3 - loop -> 9 -  7 =  2
    // 4 - loop -> 9 -  2 =  7


    // in 4 - loop this if returns true, because 7 was found in seen in 3rd loop ->  key of seen
    // so then if returns current index number which is 3 with seen[checkNumber] which is key(7) 2(value) in 3rd loop
    // we return result like intArrayOf(3, 2)
    if (seen.containsKey(checkNumber)) { //  if(seen[checkNumber] != null){
    return intArrayOf(i, seen[checkNumber]!!)
    }
    // 1 - loop -> false -> -2 is not in seen
    // 2 - loop -> false -> -6 is not in seen
    // 3 - loop -> false ->  2 is not in seen
    // 4 - loop -> true ->   7 is in seen which was in 3rd loop


    seen[nums[i]] = i
    // 1 - loop  ->  seen < 11 , 0 >   (seen[nums[i]] = i) this code add value for specified key -> seen[nums[i]]
    // 2 - loop  ->  seen < 11 , 0 >, < 15, 1 >   (seen[nums[i]] = i) this code add value for specified key -> seen[nums[i]]
    // 3 - loop  ->  seen < 11 , 0 >, < 15, 1 >, < 7, 2 >    (seen[nums[i]] = i) this code add value for specified key -> seen[nums[i]]
    // 4 - loop  ->  if() statement has complete loop with returning fun result with intArrayOf(3, 2)


    return intArrayOf()

    }*/

    val cache = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, num ->
        val b = target - num

        if (cache.contains(b)) {
            return intArrayOf(cache[b] ?: -1, index)
        }

        cache[num] = index
    }


    return intArrayOf()


}

package LeetCode.hasduplicate

fun hasDuplicateV1(nums: IntArray): Boolean {
    val map = mutableMapOf<Int, Int>()
    var idx = 0
    for (n in nums) {
        map[idx++] = n
        if(map.values.size != map.values.toSet().size) return true
    }
    return false
}

fun hasDuplicateV2(nums: IntArray): Boolean {
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false
}

fun hasDuplicateV3(nums: IntArray): Boolean {
    val set = HashSet<Int>()
    for (n in nums) {
        if(!set.add(n)) return true
    }
    return false
}

fun main() {
    val array = intArrayOf(1, 2, 3, 4)
    // val array = intArrayOf(1, 2, 3, 4)
    println(hasDuplicateV3(array))
}
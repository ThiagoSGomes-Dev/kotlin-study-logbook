package LeetCode

fun merge(nums: IntArray): IntArray {
    var ans = IntArray(2 * nums.size)
    var idx = 0

    for (i in nums) {
        println("$i -> ${i.also { ans[idx++] = it }}")
    }
    return ans
}

fun getConcatenation(nums: IntArray): IntArray {
    val ans = IntArray( 2 * nums.size)
    var idx = 0

    for (i in 0 until 2) {
        for (n in nums) {
            ans[idx++] = n
        }
    }

    return ans
}

fun main() {
    val array = intArrayOf(2, 5, 6)
    getConcatenation(array).contentToString()
}
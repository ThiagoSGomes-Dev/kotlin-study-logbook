package LeetCode.concatenation

/**
 *
 * Pré-requisitos
 * Antes de tentar resolver este problema, você deve estar confortável com:
 *
 * Arrays — Entender a indexação de arrays e como criar arrays com um tamanho específico
 * Iteração básica — Usar loops para percorrer e preencher arrays
 *
 */

fun merge(nums: IntArray): IntArray {
    var ans = IntArray(2 * nums.size)
    var idx = 0

    for (i in nums) {
        println("$i -> ${i.also { ans[idx++] = it }}")
    }
    return ans
}

fun getConcatenation(nums: IntArray, renge: Int): IntArray {
    val ans = IntArray( renge * nums.size)
    var idx = 0

    nums.indices
    nums.size
    nums[0]

    for (i in 0 until renge) {
        for (n in nums) {
            ans[idx++] = n
        }
    }

    return ans
}

fun main() {
    val array = intArrayOf(2, 5, 6)
    println(getConcatenation(array, 2).contentToString())
}
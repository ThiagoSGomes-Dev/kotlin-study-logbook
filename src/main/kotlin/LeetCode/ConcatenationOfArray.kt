package LeetCode

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
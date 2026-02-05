package LeetCode.IsAnagram

// Posso -> comparar o tamanho de cada string
// c, a, r, r, c, e

fun isAnagram(s: String, t: String): Boolean {
    s.contains(t) // true
    return false
}

fun main() {
    val s = "ccar"
    val t = "ttar"
    println(isAnagram(s = s, t = t))
}
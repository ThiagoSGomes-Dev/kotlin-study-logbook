package LeetCode.IsAnagram

// Posso -> comparar o tamanho de cada string
// c, a, r, r, c, e

fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false

    return s.toCharArray().sorted() == t.toCharArray().sorted()
}

fun main() {
    val s = "ccar"
    val t = "carc"
    println(isAnagram(s = s, t = t))
}
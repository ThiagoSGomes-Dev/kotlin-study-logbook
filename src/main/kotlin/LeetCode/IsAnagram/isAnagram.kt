package LeetCode.IsAnagram

// Posso -> comparar o tamanho de cada string
// c, a, r, r, c, e

fun isAnagram(s: String, t: String): Boolean {
    val Scount = mutableMapOf<Char, Int>()

    s.forEach {
        Scount[it] = Scount.getOrDefault(it, 0) + 1
        if (Scount[it] == s.length) return true
    }
    return false
}

fun main() {
    val s = "ccar"
    val t = "ttar"
    println(isAnagram(s = s, t = t))
}
package LeetCode.IsAnagram

// Posso -> comparar o tamanho de cada string

fun isAnagram(s: String, t: String): Boolean {
    if(s.length != t.length) return false

    return s.toCharArray().sorted() == t.toCharArray().sorted()
}

fun isAnagramV1(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val freq = IntArray(26)

    for (i in s.indices) {
        freq[s[i] - 'a']++
        freq[t[i] - 'a']--
    }

    return freq.all { it == 0 }

}


fun main() {
    println(isAnagramV1(s = "aaaa", t = "aaaa"))
}
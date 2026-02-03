package LeetCode.IsAnagram

fun isAnagram(s: String, t: String): Boolean {
    s.contains(t) // true
    return false
}

fun main() {
    val s = "racecar"
    val t = "carrace"
    println(isAnagram(s = s, t = t))
}
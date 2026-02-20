package Arrays

/**
 *
 * [
 *   0 -> "Android"
 *   1 -> "Kotlin"
 *   2 -> ["Java", "OkHttp", "RxJava"]
 *   3 -> "JUnit"
 * ]
 *
 */

val meuArray: Array<Any> = arrayOf(
    "Android",
    "Kotlin",
    arrayOf("Java", "OkHttp", "RxJava"),
    "JUnit"
)

fun main() {

    val segundoArray = meuArray[2] as Array<*>
    val rawAction = segundoArray[0] as String

    println(rawAction)
}
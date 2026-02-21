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

enum class Items(val label: String) {
    JAVA("Java"),
    JAVAC("Javac");

    companion object {
        // TODO: entries coleção interna, de enum em Kotlin
        // TODO: associateBy transforma uma coleção em um Map, usando uma chave derivada de cada elemento.
        private val map = entries.associateBy { it.label.lowercase() }

        fun fromLabel(value: String): Items {
            return map[value.lowercase()]
                ?: throw IllegalArgumentException("Action inválida: $value")
        }
    }

}

fun main() {

    val segundoArray = meuArray[2] as Array<*>
    val rawAction = segundoArray[0] as String

    val items = Items.fromLabel(rawAction)

    when (items) {
             Items.JAVA -> {
                 println("Java")
             }
            Items.JAVAC -> {
                println("Javac")
            }
    }
}
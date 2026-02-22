package Arrays

/**
 *
 * [
 *   0 -> "Login"
 *   1 -> "Home"
 *   2 -> ["GET", "POST", "PUT"]
 *   3 -> "Logout"
 * ]
 *
 */

val fluxoApp: Array<Any> = arrayOf(
    "Login",
    "Home",
    arrayOf("GET", "POST", "PUT"),
    "Logout"
)

enum class HttpMethod(val label: String) {
    GET("GET"),
    POST("POST"),
    PUT("PUT");

    companion object {
        private val map = entries.associateBy { it.label.lowercase() }

        fun fromLabel(value: String): HttpMethod {
            return map[value.lowercase()]
                ?: throw IllegalArgumentException("Método inválido: $value")
        }
    }

}


fun main() {

}
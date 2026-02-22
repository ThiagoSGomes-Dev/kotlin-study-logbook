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

    val arrayInterno = fluxoApp[2] as Array<*>
    val rawMethod = arrayInterno[1] as String // "POST"

    val httpMethod = HttpMethod.fromLabel(rawMethod)

    when (httpMethod) {
        HttpMethod.GET -> {
            println("Executando requisição GET")
        }
        HttpMethod.POST -> {
            println("Executando requisição POST")
        }
        HttpMethod.PUT -> {
            println("Executando requisição PUT")
        }
    }
}
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
}


fun main() {

}
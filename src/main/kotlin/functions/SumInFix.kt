package functions

// Exemplo de erro -> infix fun sum(num: Int): Int = this + num

/**
 *
 * Funções infix só podem ser definidas em classes ou se for uma função de extenção.
 *
 */

infix fun Int.sum(num: Int): Int = this + num

fun sum2(num: Int): Int {
    return num
}

fun main() {
    println(1 + sum2(2))
    // Ganhos com infix
    println(1 sum 2)
}
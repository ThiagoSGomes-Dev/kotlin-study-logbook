package estCont

/**
 *
 *
 * apply é uma scope function (função de escopo) do Kotlin.
 *
 * - executar várias ações sobre um objeto
 * - sem precisar repetir o nome dele
 * - retornando o próprio objeto no final
 *
 *
 */

// Sem apply

/**
 *
 * btnClick.visible()
 * btnClick.setOnClickListener()
 * btnClick.text = "Olá"
 *
 */

// Com apply

/**
 *
 * btnClick.apply {
 *     visible()
 *     setOnClickListener()
 *     text = "Olá"
 * }
 *
 */

fun main() {

    fun visible(): Unit {}
    fun gone(): Unit {}
    fun setOnClickListener(): Unit {}

    var text = "textos"

    fun bind(
        data: Data
    ) {
        val btnClick = "Text"
        btnClick.apply {
            if (data.button != null) {
                visible()
                text = data.button.text
                setOnClickListener()
            } else {
                gone()
            }
        }
    }

}
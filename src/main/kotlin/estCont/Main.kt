package estCont

/**
 * Scope functions:
 * https://kotlinlang.org/docs/scope-functions.html
 *
 */

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

private val String.editName: Any
    get() {

    }

/**
 *
 * btnClick.apply {
 *     visible()
 *     setOnClickListener()
 *     text = "Olá"
 * }
 *
 */

const val editName = ""

fun main() {

    fun visible(): Unit {}
    fun gone(): Unit {}
    fun setOnClickListener(): Unit {}

    var text = "textos"
    var binding = ""

    fun bind(
        data: Data
    ) {
        val btnClick = "Text"
        btnClick.apply {
            if (data.button != null) {
                // if (se) data.button existe
                visible()
                text = data.button.text
                setOnClickListener()
            } else {
                gone()
            }
        }

        // Mostrar/ ocultar botão se campo estiver vazio
        if (binding.editName.text.isNullOrBlank()) {
            binding.btnSave.visibility = View.GONE
        } else {
            binding.btnSave.visibility = View.VISIBLE
        }

        // Alterar cor do TextView conforme status
        if (status == "ERROR") {
            binding.txtStatus.setTextColor(Color.RED)
        } else {
            binding.txtStatus.setTextColor(Color.GREEN)
        }

        // Habilitar botão só se checkbox marcado
        if (binding.checkboxTerms.isChecked) {
            binding.btnContinue.isEnabled = true
        } else {
            binding.btnContinue.isEnabled = false
        }

        // Trocar texto do botão conforme modo
        if (isEditMode) {
            binding.btnAction.text = "Atualizar"
        } else {
            binding.btnAction.text = "Criar"
        }

        // Alterar cor do TextView conforme status
        if (status == "ERROR") {
            binding.txtStatus.setTextColor(Color.RED)
        } else {
            binding.txtStatus.setTextColor(Color.GREEN)
        }

        // Ação do botão (Presenter controla fluxo)
        enum class Action {
            SAVE,
            DELETE,
            SHARE
        }
        fun onAction(action: Action) {
            when (action) {
                SAVE -> save()
                DELETE -> delete()
                SHARE -> share()
            }
        }

        // Resultado de operação
        enum class OperationResult {
            SUCCESS,
            FAILURE,
            RETRY
        }
        when (result) {
            SUCCESS -> view.showSuccess()
            FAILURE -> view.showError()
            RETRY -> retry()
        }

        // Quando baseado no ID do View clicado
        override fun onClick(view: View) {
            when (view.id) {
                R.id.btnSave -> salvar()
                R.id.btnDelete -> deletar()
                R.id.btnShare -> compartilhar()
            }
        }

        // Continua vazio
        val name = text ?: "default"
        // Correto para null
        val name = text.takeIf { it.isNotBlank() } ?: "default"


    }

}
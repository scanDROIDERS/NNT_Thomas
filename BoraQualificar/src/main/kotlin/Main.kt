import java.io.File

fun main() {

    val arquivo = File("funcionarios.csv")
    if (!arquivo.exists())
        criarArquivo(arquivo)

    while(true) {
        println("1 - Cadastrar funcionario")
        println("2 - Listar funcionarios")
        println("3 - Excluir funcionario")
        println("4 - Sair")
        print("Opcao: ")
        val opcao = readln()?.toIntOrNull() ?: continue

        when(opcao) {
            1 -> {
                println("Cadastro de funcionario")
                adicionarFuncionario(arquivo)
                println("Funcionario cadastrado com sucesso!")
            }
            2 -> {
                println("Listar funcionarios")
                listarFuncionarios(arquivo)
            }
            3 -> {
                println("Excluir funcionario")
                procurarNomeFuncionario(arquivo)
            }
            4 -> return
            else -> println("Opcao invalida")
        }
    }
}

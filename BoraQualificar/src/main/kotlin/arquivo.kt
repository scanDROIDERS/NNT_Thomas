import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun criarArquivo(arquivo: File) {
    val escrita = FileWriter(arquivo)
    escrita.write("Nome\tCargo\tSalario")
    escrita.close()
}

fun adicionarFuncionario(arquivo: File) {
    val funcionario = cadastrarFuncionario()
    val leitura = FileReader(arquivo)

    val linhasPresentesNoArquivo = leitura.readLines().toMutableList()
    leitura.close()

    val novaLinha = "${funcionario.nome}\t${funcionario.cargo}\t${funcionario.salario}"
    linhasPresentesNoArquivo.add(novaLinha)

    val escrita = FileWriter(arquivo)
    escrita.write(linhasPresentesNoArquivo.joinToString("\n"))
    escrita.close()
}

fun listarFuncionarios(arquivo: File) {
    val leitura = FileReader(arquivo)
    val linhasPresentesNoArquivo = leitura.readLines()
    leitura.close()

    if (linhasPresentesNoArquivo.isEmpty()) {
        println("Sem nada no arquivo")
        return
    }

    for (linha in linhasPresentesNoArquivo) {
        val dado = linha.split("\t")
        val nome = dado[0]
        val cargo = dado[1]
        val salario = dado[2]
        println("${nome}\t|${cargo}\t|${salario}\t")
    }
}

fun procurarNomeFuncionario(arquivo: File) {
    print("Digite o nome do funcionario a ser excluido: ")
    val nomeProcurado = readln()
    val leitura = FileReader(arquivo)

    val linhasPresentesNoArquivo = leitura.readLines().toMutableList()
    leitura.close()

    var achou = false
    var index = -1
    for ((i, nome) in linhasPresentesNoArquivo.withIndex()) {
        val dado = nome.split("\t")
        val nomeNoArquivo = dado[0].lowercase()
        if (nomeNoArquivo.equals(nomeProcurado, true)) {
            achou = true
            index = i
            break
        }
    }

    if (!achou) {
        println("Funcionario nao encontrado")
        return
    }
    linhasPresentesNoArquivo.removeAt(index)

    val escrita = FileWriter(arquivo)
    escrita.write(linhasPresentesNoArquivo.joinToString("\n"))
    escrita.close()

    println("Funcionario deletado com sucesso")
}
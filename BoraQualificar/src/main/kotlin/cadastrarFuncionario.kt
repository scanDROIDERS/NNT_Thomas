

fun cadastrarFuncionario(): Funcionario {
    val nome: String
    val cargo: String
    val salario: Double

    print("Nome: ")
    nome = readln()
    print("Cargo: ")
    cargo = readln()
    print("Salario: ")
    salario = readln().toDouble()

    return Funcionario(nome, cargo, salario)
}
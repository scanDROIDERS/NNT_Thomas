
class User( val name: String, val age: Int)
fun main() {
    val userList = mutableListOf<User>()
    var option: Int

    do {
        println("\n1. Adicionar usuario\n" +
                "2. Listar usuarios\n" +
                "3. Media de idades\n" +
                "4. Buscar pelo nome\n" +
                "5. Remover pelo nome\n" +
                "6. Sair")
        option = readln().toInt()
        when(option) {
            1 -> {
                print("\nAdicionar usuario")

                print("Nome do usuario: ")
                val name = readln()
                print("\nIdade do usuario: ")
                val age = readln().toInt()

                userList.add(User(name, age))
                println("Usuario adicionado!")
            }
            2 -> {
                println("Listar usuarios")
                for (user in userList) {
                    println("|${userList.indexOf(user) + 1}| ${user.name}, ${user.age}")
                    println("-------------")
                }
            }
            3 -> {
                println("Media das idades")
                var average = 0.0
                for ( user in userList) {
                    average += user.age.toDouble()
                }
                average /= userList.size.toDouble()
                println("Media das idades dos usuarios e ${average} anos")
            }
            4 -> {
                println("Buscar pelo nome")
                val nameToSearch = readln()
                for (user in userList) {
                    if (user.name.lowercase() == nameToSearch.lowercase()) {
                        println("|${userList.indexOf(user) + 1}| ${user.name}, ${user.age}")
                    }
                }
            }
            5 -> {
                println("Remover pelo nome")
                val nameToRemove = readln()
                for (user in userList) {
                    if (user.name.lowercase() == nameToRemove.lowercase()) {
                        println("Usuario removido ${user.name}")
                        userList.remove(user)
                    }
                }
            }
            6 -> break
            else -> println("Opcao Invalida")
        }
    }while(option != 6)
    println("Saiu")
}

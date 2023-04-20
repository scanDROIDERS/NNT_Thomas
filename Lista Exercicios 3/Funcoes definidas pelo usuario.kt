
//1
fun soma(n1: Int, n2: Int): Int = n1 + n2

//2
fun ePar(num: Int): Boolean {
    if (num % 2 == 0) return true
    return false
}

//3
fun palindromo(string: String): Boolean {
    if (string == string.reversed()) return true
    return false
}

//4
fun maiorNum(array: Array<Int>): Int = array.max()

//5
fun cincoCaracteres(array: Array<String>): List<String> {
    val list = mutableListOf<String>()
    for (string in array) {
        if (string.length > 5) list.add(string)
    }
    return list
}
fun main() {
    //1
    println("Exercicio 1")
    println("A soma de 1 + 2 e ${soma(1,2)}")
    //2
    println("Exercicio 2")
    println("O numero 3 e par?${ePar(3)}")
    //3
    println("Exercicio 3")
    println("A string ovo e palindromo? ${palindromo("ovo")}")
    //4
    println("Exercicio 4")
    val array = arrayOf<Int>(1,2,3,4,5,6,7)
    println("A soma de 1 + 2 e ${soma(1,2)}")
    //5
    println("Exercicio 5")
    val array2 = arrayOf<String>("Thomas", "IFSP", "Computador", "Campinas", "NNT")
    val list = cincoCaracteres(array2)
    println("A strings que possuem mais de 5 caracteres sao: ")
    for (item in list) println(item)

}
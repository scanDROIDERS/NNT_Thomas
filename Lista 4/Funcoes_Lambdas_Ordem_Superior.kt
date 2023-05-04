
fun ex2(lista: List<Int>, operacao: (Int) -> Int): List<Int> {
    val novaLista = mutableListOf<Int>()
    for (i in lista) novaLista.add(operacao(i))
    return novaLista
}

fun ex5(lista: List<Int>, operacao: (List<Int>) -> Int): Int {
    return operacao(lista)
}

fun ex6(num1: Int, num2: Int, operacao: (Int, Int) -> Int): Int {
    return operacao(num1, num2)
}

fun ex7(mensagem: String, repet: Int, repetir: (String,Int) -> Unit) {
    repetir(mensagem, repet)
}


fun main(){
    //1
    println("Exercicio 1")
    val list1 = listOf(6,5,4,3,2,1)
    val list2 = list1.sortedBy { num -> num }
    println(list2)

    //2
    println("Exercicio 2")
    val mais1 = {num: Int -> num + 1}
    val lista3 = ex2(list1, mais1)
    println(lista3)

    //3
    println("Exercicio 3")
    val lista4 = mutableListOf<Int>()
    list2.forEach { num ->
        run {
            if (num % 2 == 0) {
                lista4.add(num)
            }
        }
    }
    println(lista4)

    //4
    println("Exercicio 4")
    var max = list2[0]
    list2.forEach { num ->
        run {
            if (num > max) {
                max = num
            }
        }
    }
    println(max)

    //5
    println("Exercicio 5")
    val somar = {lista: List<Int> -> lista.reduce{sum, num -> sum + num}}
    println(ex5(list1, somar))

    //6
    println("Exercicio 6")
    val multi = {num1: Int, num2: Int -> num1 * num2}
    println(ex6(5, 4, multi))

    //7
    println("Exercicio 7")
    val mensagem = "Ola NNT, voces sao bem vindos ao IFSP Campus Campinas!!"
    val rep = 5
    val repeticao = {mensagem: String, rep: Int -> repeat(rep) { println(mensagem)} }
    ex7(mensagem, rep, repeticao)


}


fun main() {
    //1
    println("Exercicio 1")
    var cont = 1
    do {
        println(cont)
        cont++
    } while(cont <= 10)

    //2
    println("Exercicio 2")
    var num: Int
    do {
        println("Digite um numero(se for negativo ele sai): ")
        num = readln().toInt()
    }while(num >= 0)

    //3
    println("Exercicio 3")
    val luckNumber = (1..10).random()
    var number: Int
    println(luckNumber)
    do {
        println("Adivinhe o numero sorteado: ")
        number = readln().toInt()
    }while(number != luckNumber)
}
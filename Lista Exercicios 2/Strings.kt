

fun main() {

    //1
    println("Exercicio 1")
    println("Digite uma frase")
    val frase = readln()
    println("A frase possui ${frase.length} caracteres")
    //2
    println("Exercicio 2")
    println("Digite uma frase")
    val frase2 = readln()
    for (caracter in frase2.length - 1 downTo 0) {
        print("${frase2[caracter]} ")
    }
    //3
    println("\nExercicio 3")
    println("Digite uma frase")
    val frase3 = readln()
    for(caracter in frase3) {
        when(caracter) {
            'a','e','i','o','u' -> println(caracter)
            else -> continue
        }
    }
}
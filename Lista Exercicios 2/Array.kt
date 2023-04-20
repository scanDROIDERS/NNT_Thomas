import kotlin.math.max

fun main() {
    //1
    println("Exercicio 1")
    var array = arrayOf<Int>()
    for(num in 1..10){
        array +=  (0..100).random()
    }
    for (num in array) print("${num} ")
    println("\nO maior numero desse array e ${array.max()}")
    //2
    println("Exercicio 2")
    var array2 = arrayOf<Double>()
    for (num in array2) print("${num} ")
    for(num in 1..10) {
        array2 += readln().toDouble()
    }
    println("A media do array e ${array2.average()}")
    //3
    println("Exercicio 3")
    var frutas = arrayOf("Amora", "Abacate", "Banana", "Acai", "Pera", "Maca", "Abacaxi","Melancia", "Limao", "Roma")
    for (names in frutas) {
        if (names.lowercase().startsWith('a')) println(names)
    }
}
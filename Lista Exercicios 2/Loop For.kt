

fun main() {
    //1
    println("Exercicio 1")
    for (i in 1..10) {
        println(i)
    }
    //2
    println("Exercicio 2")
    for (i in 0..20) {
        if (i % 2 == 0) println(i)
    }
    //3
    println("Exercicio 3")
    for (i in 10 downTo 0) {
        if (i % 2 != 0) println(i)
    }

}
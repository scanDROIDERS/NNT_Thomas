

fun main() {
    //1
    println("Exercicio 1")
    var cont = 1
    while(cont <= 10) {
        println(cont)
        cont++
    }

    //2
    println("Exercicio 2")
    var cont2 = 0
    while(cont2 <= 20) {
        if (cont2 % 2 == 0) {
            println(cont2)
        }
        cont2++
    }

    //3
    println("Exercicio 3")
    var cont3 = 10
    while(cont3 >= 0) {
        if (cont3 % 2 != 0) {
            println(cont3)
        }
        cont3--
    }
}
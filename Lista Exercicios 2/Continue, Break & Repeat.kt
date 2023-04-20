

fun main() {
    //1
    println("Exercicio 1")
    for(i in 0..10) {
        if(i == 5) continue
        else println(i)
    }
    //2
    println("Exercicio 2")
    var num: Int = 0
    while(num >= 0) {
        println("Digite um numero: ")
        num = readln().toInt()

        if (num < 0) break
    }
    //3
    println("Exercicio 3")
    println("Digite um numero")
    var number = readln().toInt()
    for(i in 0..number){
        if(i == 4) continue
        else println(i)
    }
}
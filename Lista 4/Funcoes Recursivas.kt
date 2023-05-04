
//1
fun fatorial(n: Int): Int {
    if (n == 0) return 1
    return fatorial(n - 1) * n
}

//2
fun fibonacci(n: Int): Int {
    if(n <= 1) return n
    return fibonacci(n-1) + fibonacci(n-2)
}

//3
fun mdc(n1: Int, n2: Int): Int {
    if (n1 % n2 == 0) return n2
    return mdc(n2, (n1 % n2))
}
fun main() {
    //1
    println("Exercicio 1")
    println("Fatorial: ${fatorial(5)}")

    //2
    println("Exercicio 2")
    println("Fibonacci: ${fibonacci(10)}")
    //3
    println("Exercicio 3")
    println("MDC: ${mdc(6, 12)}")
}
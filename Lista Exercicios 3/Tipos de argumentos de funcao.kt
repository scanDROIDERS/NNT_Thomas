//1
fun soma(vararg nums: Int): Int {
    var soma = 0
    for (num in nums) soma += num
    return soma
}

//2
fun maiorQN(array: Array<Int>, num: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (nums in array) {
        if (nums > num) list.add(nums)
    }
    return list
}

//3
fun arrayTransformado(transformar: (Int) -> Int, array: Array<Int>): List<Int> {
    val list = mutableListOf<Int>()
    for (number in array) list.add(transformar(number))
    return list
}

//4
fun comecaCom(array: Array<String>, char: Char): List<String> {
    val list = mutableListOf<String>()
    for (item in array) {
        if (item.lowercase().startsWith(char.lowercase())) list.add(item)
    }
    return list
}

//5
fun multiPos(array: Array<Int>, num: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (item in array) {
        if(item % num == 0) list.add(item)
    }
    return list
}
fun main() {
    //1
    println("Exercicio 1")
    println("A soma de 1,2,3,4,5,6,7,8,9,10 e ${soma(1,2,3,4,5,6,7,8,9,10)}")

    //2
    println("Exercicio 2")
    val array = arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    val n = 6
    val list = maiorQN(array, n)
    for(item in list) print("${item} ")

    //3
    println("\nExercicio 3")
    val array2 = arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    val list2 = arrayTransformado({it * 10}, array2)
    for(num in list2) print("${num} ")

    //4
    println("\nExercicio 4")
    val array3 = arrayOf<String>("Thomas", "IFSP", "Computador", "Campinas", "NNT")
    val char = 'c'
    val list3 = comecaCom(array3, char)
    for(item in list3) print("${item} ")

    //5
    println("\nExercicio 5")
    val array4 = arrayOf<Int>(1,2,3,4,5,6,7,8,9)
    val mult = 3
    val list4 = multiPos(array4, mult)
    for (item in list4) print("${item} ")

}


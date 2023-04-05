fun main() {
    /*Introdução ao Kotlin*/
    /* a) Crie um arquivo Kotlin e explique as diferenças entre ele e um arquivo Java.*/
    /*Resposta: Um arquivo java mostra inicialmente uma estrutura baseada em POO, podendendo já inferir uma diferença
    de paradigmas entre Kotlin e Java. Além da facilidade na sintaxe do Kotlin diante o Java*/


    /*Variáveis e Constantes*/
    /*a) Crie uma variável do tipo inteiro e atribua o valor 10. Em seguida, crie uma constante e
    atribua o valor 5. Qual a diferença entre variáveis e constantes?*/
    var variableNumber: Int = 10
    val constNumber: Int = 5
    /*Resposta: As váriaveis podem mudar de valor durante o tempo de execução do script, já uma constante, o valor se
    mantem o mesmo durante a exucução */


    /*Tipos de dados*/
    /*a) Crie uma variável para armazenar um número decimal. Qual tipo de dado você deve
    utilizar?*/
    val floatNumber: Double = 3.14
    /*Resposta: Tive que utilizar uma variável do tipo Double*/

    /*b) Crie uma variável para armazenar um texto e outra para armazenar um número inteiro.
    Qual tipo de dado você deve utilizar para cada uma?*/
    val string: String = "NNT"
    val number: Int = 10
    /*Resposta: Tive que utilizar uma variável do tipo String para armazenar um texto, e uma Int para numero inteiro*/

    /*c) Crie uma variável para armazenar um número inteiro e outra para armazenar um número
    decimal. Qual tipo de dado você deve utilizar para cada uma?*/
    val integerNumber: Int = 10
    val float: Double = 10.0
    /*Resposta: Tive que utilizar uma variável do tipo Double para o numero decimal, e outra do tipo Int para o
    numero inteiro*/


    /*Operadores*/
    /*a) Crie duas variáveis inteiras e faça a soma utilizando o operador +.*/
    val n1 = 10
    val n2 = 2
    val soma = n1 + n2
    println(soma)

    /*b) Crie uma variável do tipo Boolean e atribua o resultado da expressão 5 > 3 && 2 < 4. O
    que será exibido ao imprimir o valor dessa variável?*/
    val isBoolean: Boolean = (5 > 3 && 2 < 4.0)
    println(isBoolean)

    /*c) Crie uma variável do tipo Boolean e atribua o resultado da expressão !(10 > 5 || 3 < 1). O
    que será exibido ao imprimir o valor dessa variável?*/
    val otherBoolean = !(10 > 5 || 3 < 1)
    println(otherBoolean)


    //Entrada, processamento e saida

    /*1 - Faça um programa que peça ao usuário para digitar dois números e mostre a soma
    desses números.*/
    println("Digite um numero: ")
    val num1 = readln().toInt()
    println("Digite outro numero: ")
    val num2 = readln().toInt()
    println("A soma e ${num1 + num2}")

    /*2 - Faça um programa que calcule o quadrado de um número informado pelo usuário.*/
    println("Digite um numero para ficar ao quadrado: ")
    val numquad = readln().toInt()
    println("O numero $numquad ao quadrado e ${numquad * numquad}")

    /*3 - Faça um programa que peça ao usuário para informar seu nome e sua idade, e que
    exiba uma mensagem de boas-vindas com o nome e a idade informados.*/
    println("Digite seu nome: ")
    val nome = readln()
    println("Digite sua idade: ")
    val idade = readln().toInt()
    println("Bem vindo(a) $nome ,$idade")


    //Comentários
    //a) Crie um arquivo Kotlin e insira um comentário explicando o objetivo do programa.
    //Unir todos os exercicios


    //Questões práticas sobre if/else:
    /*1 - Faça um programa que receba duas notas de um aluno e calcule a média. Se a média
    for maior ou igual a 7, exiba "Aprovado". Caso contrário, exiba "Reprovado". Use if/else.*/
    println("Digite a nota 1: ")
    val nota1 = readln().toDouble()
    println("Digite a nota 2: ")
    val nota2 = readln().toDouble()
    val media = (nota1 + nota2)/2
    if (media >= 7) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    /*2 - Faça um programa que receba um número inteiro e verifique se ele é par ou ímpar
    usando if/else.*/
    println("Digite um numero ")
    val numToVerify = readln().toInt()
    if (numToVerify % 2 == 0) {
        println("Par")
    } else {
        println("Impar")
    }

    /*3 - Faça um programa que receba um número inteiro e verifique se ele é positivo, negativo
    ou zero usando if/else.*/
    println("Digite um numero ")
    val numNegOrPos = readln().toInt()
    if (numNegOrPos > 0) {
        println("Positivo")
    } else if (numNegOrPos < 0) {
        println("Negativo")
    } else {
        println("Igual a 0")
    }

    /*4 - Faça um programa que verifique se uma pessoa é maior de idade (18 anos ou mais)
    usando if/else.*/
    println("Digite uma idade ")
    val idadeBig = readln().toInt()
    if (idadeBig >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }


    //Questões práticas sobre when:
    /*1 - Faça um programa que receba um número de 1 a 7 e exiba o dia da semana
    correspondente usando when.*/
    println("Digite um numero para achar o dia da semana: ")
    val numWeek = readln().toInt()
    when (numWeek) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terca")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sabado")
        else -> println("Numero invalido")
    }
    /*2 - Faça um programa que verifique se um animal é um mamífero, ave ou réptil usando
    when.*/
    println("Digite um animal: ")
    val animal = readln()
    when(animal) {
        "Vaca", "Baleia", "Porco" -> println("Mamiferos")
        "Galinha", "Pombo", "Gaviao" -> println("Ave")
        "Crocodilo", "Lagarto", "Cobra" -> println("Reptil")
        else -> println("Animal nao esta no banco de dados")
    }

    /*3 - Faça um programa que receba uma letra e verifique se ela é uma vogal ou consoante
    usando when.*/
    println("Digite uma letra: ")
    val letra = readln()
    when(letra) {
        "a", "e", "i", "o", "u" -> println("Vogal")
        else -> println("Consoante")
    }
    /*4 - Faça um programa que receba um número de 1 a 12 e exiba o mês correspondente
    usando when.*/
    println("Digite um numero para achar o mes: ")
    val numMonth = readln().toInt()
    when (numMonth) {
        1 -> println("Jan")
        2 -> println("Fev")
        3 -> println("Mar")
        4 -> println("Abr")
        5 -> println("Mai")
        6 -> println("Jun")
        7 -> println("Jul")
        8 -> println("Ago")
        9 -> println("Set")
        10 -> println("Out")
        11 -> println("Nov")
        12 -> println("Dez")
        else -> println("Numero invalido")
    }

    //Desafio semanal
    println("Desafio Semanal")
    println("Qual tipo de unidade ele deseja converter: 1. temperatura, 2. distância ou 3. tempo.")
    val opc = readln().toInt()
    when(opc) {
        1 -> {
            println("Digite a temperatura em Celsius: ")
            val cels = readln().toDouble()
            val fah = (cels * (9/5)) + 32
            print("Fah: $fah")
        }
        2 -> {
            println("Digite a distancia em metros: ")
            val meter = readln().toInt()
            val km = meter/1000
            print("Km: $km")
        }
        3 -> {
            println("Digite o tempo em minutos: ")
            val min = readln().toInt()
            val hour = min/60
            print("Hour: $hour")
        }
        else -> println("Opcao invalida")
    }
}
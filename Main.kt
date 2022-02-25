fun main(args: Array<String>) {
//    atividade1()
//    atividade2()
//    atividade3()
    atividade4()
}

fun atividade1(): Unit {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número:")
    val num2 = readLine()!!.toFloat()
    println("Digite o terceiro número:")
    val num3 = readLine()!!.toFloat()

    if (num1 == num2 && num1 == num3) {
        println("Triângulo Equilátero")
    } else if (num1 == num2 && num1 != num3) {
        println("Triângulo Isósceles")
    } else if (num1 != num2 && num1 != num3) {
        println("Triângulo Escaleno")
    }
}

fun atividade2(): Unit{
    println("Digite um ano:")
    val ano = readLine()!!.toShort()

    if(ano % 4 == 0 && ano % 100 != 0 || ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0){
        println("Ano bissexto!!!")
    }else{
        println("Ano habitual!!!")
    }
}

fun atividade3(): Unit{
    var contagem = 0
    println("Telefonou para a vítima?")
    if(readLine()!!.equals("S",true)) contagem++
    println("Esteve no local do crime?")
    if(readLine()!!.equals("S",true)) contagem++
    println("Mora perto da vítima?")
    if(readLine()!!.equals("S",true)) contagem++
    println("Devia para a vítima?")
    if(readLine()!!.equals("S",true)) contagem++
    println("Já trabalhou com a vítima?")
    if(readLine()!!.equals("S",true)) contagem++


    if(contagem == 5){
        println("Assassino!!!")
    }else if(contagem >= 3){
        println("Cumplise!!!")
    }else if(contagem >= 2){
        println("Suspeito!!!")
    }else{
        println("Inocente!!!")
    }
}

fun atividade4(): Unit{
    println("Escolha o tipo combustivel:\nA - álcool\nG - gasolina")
    val combustivel = readLine()!!
    println("Escolha a quantidade de litros:")
    val litros = readLine()!!.toFloat()


    if(combustivel.equals("A",true)){
        if(litros>=20){
            println("O valo a pagar é ${litros - litros * 0.05}")
        }else if(litros<=20){
            println("O valo a pagar é ${litros - litros * 0.03}")
        }
    }else if(combustivel.equals("G",true)){
        if(litros>=20){
            println("O valo a pagar é ${litros - litros * 0.06}")
        }else if(litros<=20){
            println("O valo a pagar é ${litros - litros * 0.04}")
        }
    }else{
        println("Combustível inválido!!!")
    }

}


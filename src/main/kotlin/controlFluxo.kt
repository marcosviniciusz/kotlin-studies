fun calculaBonus(cargo: String, salario: Float) : Float{
    //Gerente Junior, Gerente Senior, Coodernador

    val bonus: Float
    if (cargo == "Coordenador"){
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Junior"){
        bonus = salario * 0.5f
    } else{
        bonus = salario * 2
    }

    return bonus
}

fun maiorDeIdade(idade: Int) : Boolean {
    return idade >= 18
}

fun main(){

    println(maiorDeIdade(10))
    println(maiorDeIdade(18))
    println(maiorDeIdade(27))


    val test: Int? = null
    val op: Int = test?: 100
    println(op)

    println(calculaBonus("Coordenador",1000f))
    println(calculaBonus("Gerente Junior",1000f))
    println(calculaBonus("Gerene Senior",1000f))
}
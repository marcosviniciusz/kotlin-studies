fun calculaBonus(cargo: String, salario: Float) : Float{
    //Gerente Junior, Gerente Senior, Coodernador

    var bonus: Float
    if (cargo == "Coordenador"){
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Junior"){
        bonus = salario * 0.5f
    } else{
        bonus = salario * 2
    }

    return bonus
}

fun maiorDeIdade(idade: Int) : Boolean{
    return idade >= 18
}

fun main(){
/*
    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(27)

 */
    println(calculaBonus("Coordenador",1000f))
    println(calculaBonus("Gerente Junior",1000f))
    println(calculaBonus("Gerene Senior",1000f))
}
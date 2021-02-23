fun operacao(a: Int, b: Int,c: String) {
    /*
    when (c){
        "Soma" -> return a + b
        "Subtração" -> {
            return a - b
        }
        else -> {
            println("Operação inválida!")
            return 0
        }
    }
    */

    when {
        a > 0 && b > 0 -> {
            println("Bariaveis maiores que zero")
        }
    }

    when (a){
        in 1..99 -> { // .. = de 1 a 99 / Range - Intervalo de valores
            println("Século")
        }
    }

}



fun main(){
    operacao(10,10,"Soma")
    operacao(10,10,"Subtração")
}
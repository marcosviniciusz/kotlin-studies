fun calcBonus(a: Int, b: Int, c: Int) {
    println("O bonus e: ${a + b * c}")
}

fun hello(nome: String) : String {
    return "Olá, $nome"
}

fun newHello(nome: String) : String = "Olá, $nome"

fun soma(a: Int, b:Int) : Int = a + b

fun main() {
    calcBonus(10, 20, 30)

    println(newHello("Marcos Vinicius"))
    println(hello("Jim Carrey"))
    print(soma(500,600))

}
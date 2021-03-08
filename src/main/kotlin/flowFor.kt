fun main(){

    // for - loop
    //loop ininito

    val str = "Marcos Vinicius"
    for (c in str){
        print("$c ")
    }


    for (i in 1..100 step 2){// step 2 = imprimir de 2 em 2
        if (i != 80) {
            print("$i ")//imprime de 1 a 100
        }
    }

    for (j in 100 downTo 0) {// imprimi de 100 a 0
        print("$j ")
    }

}
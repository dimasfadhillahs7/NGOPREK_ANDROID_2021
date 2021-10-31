package Looping

fun main(){
    //while do
    var counterWhile = 0
    while (counterWhile <= 7){
        println("Hasil counter\t: $counterWhile")
        counterWhile++
    }

    //do while
    var counterDo = 10
    do {
        println("Hasil counter\t: $counterDo")
        counterDo--
    }while (counterDo>0)

    //for each
    val ranges = 1.rangeTo(10)
    for (i in ranges){
        println("values is $i")
    }
}
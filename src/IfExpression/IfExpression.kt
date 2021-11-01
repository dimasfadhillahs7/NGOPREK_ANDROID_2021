package IfExpression

fun main(){

    val lapar = false
    if (lapar){
            println("Saya lapar dan akan makan")
    }
    else {
        println("Saya tidak makan")
    }

    val openHours = 7
    val now = 7

    //if langsung return ke variable
    val office = if (now > openHours){
                    "Kantin buka"
                }
                else if (now == openHours){
                    "Mohon tunggu, kantin sedang disiapkan"
                }
                else {
                    "Kantin tutup"
                }
    println(office)

    println("Office ${if (now > openHours) "already opened" else "are closed"}")

    //Elvis
    val text : String? = null
    val textLength = text?.length ?:7
    println(textLength)

    var score :Int? = null
    println(score ?: 100)
    score = 80
    println(score ?:100)

}
package WhenExpression

import java.util.*

fun main(){
    val value = 20
    val scanner = Scanner(System.`in`)

//    when (value){
//        6 -> println("value is 6")
//        7 -> println("value is 7")
//        8 -> println("value is 8")
//        else -> println("Value cant be reach")
//    }

    println("----> Menu Kalkulator <----")
    println("1. Penjumlahan")
    println("2. Pengurangan")
    print("Masukkan Input : ")
    val input = scanner.nextInt()

    print("Masukkan bilangan pertama\t: ")
    val bil1 =scanner.nextInt()

    print("Masukkan bilangan kedua\t: ")
    val bil2 = scanner.nextInt()

    when(input){
        1 -> println("Hasil penjumlahan\t= ${bil1+bil2}")
        2 -> println("Hasil pengurangan\t= ${bil1-bil2}")
        3 -> println("Gada pilihan!!1")
    }

    //-----------------
    val valueRange = 27
    val ranges = 10..50

    when(valueRange){
        in ranges -> println("value ada didalam range")
        !in ranges -> println("value tidak ada dalam range")
        !in ranges -> println("value tidak diketahui")
    }
    //-------------
    val variable : Any = 23
    when(variable){
        is Int -> println("Its an integer")
        is Char -> println("Its an char")
        is Double -> println("Its an double")
        else -> println("unknown")
    }
    //----------
    val angka = Random().nextInt(10)-5
    when {
        angka < 0 -> {
            println("Negative")
            println("value")
        }
        angka == 0 -> {
            println("Zero")
            println("value")
        }
        angka > 0 -> {
            println("Positive")
            println("value")
        }
        else -> println("undefined")
    }






}
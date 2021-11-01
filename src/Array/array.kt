package Array

fun main(){

    val doubleArray = doubleArrayOf(1.0, 2.3, 4.1) //array sesuai tipe data double
    val intArray2 = intArrayOf(1,2,3,4) //array sesuai tipe data int
    val charArray = charArrayOf('a', 'A', 'B')

    val array1 = arrayOf("String1", "String2", "String3")
    val arrayMixTD = arrayOf("string", 2, 1.0, 'A')

    val intArray = Array(4,{i ->
        i //variable i akan generate 0,1,2,3
    })

    val intArray1 = Array(4,{i ->
        i*i //variable i akan dikalikan dengan i sampai 4 kali
    })

    for (x in intArray){
        print("$x, ")
    }

    println()
    var elementArray = arrayMixTD[2]

    println(elementArray)

}
package Function

fun main() {
    val user = functionUser("Bagus", 20)
    println(user)

    procedureUser("Bayu")

    val userQuick = functionQuick("Lisa", 17)
    println(userQuick)

}
//Method memiliki 2 jenis
/*
* - fungsi = memiliki tipe data dan mengembalikan nilai
* - prosedur = jalan sampai selesai tidak mengembalikan nilai
 */

//prosedur
fun procedureUser(name: String){
    println("Kimi no nawa $name")
}

//fungsi
fun functionUser(name : String, age : Int) : String {
    val output = "Kimi no nawa $name desu, $age sai desu"
    return output
}

//fungsi penulisan cepat
fun functionQuick(name: String, age: Int) = "Your name is $name, $age years old"


package HELLO


fun main(){
        println("Hello World")
        print("Hello World")
        print("Hello World")

        val variable1 = 1 //menampung data static (tidak dapat dirubah)
        var variable2 = 5 //Menampung data dinamik (dapat diubah)

        var variableString = "A"
        var variableChar = 'A'
        var variableDouble = 1.0
        var variableBoolean = false

        //print
        println("Nilai dari variable = " + variableBoolean + " dengan tipe data boolean")
        println(" Nilai dari variable\t: $variableString dengan tipe data string")

        println("Penjumlahan " + (variable1+variable2))
        println("Penjumlahan ${variable1+variable2}")



    }


package GenelSorular

fun main(args: Array<String>) {
    // Klavyeden kenarları girilen bir ücgenin çesidini veren uygulamayı yazınız.

    println("birinci kenarı giriniz: ")
    var kenar1:Double = readLine()!!.toDouble()
    println("ikinci kenarı giriniz: ")
    var kenar2:Double = readLine()!!.toDouble()
    println("ucuncu kenarı giriniz: ")
    var kenar3:Double= readLine()!!.toDouble()

    if (kenar1==kenar2 && kenar1 == kenar3)
    {
        println("girdiğiniz ücgen eşkenar üçgendir.")
    }
    else if (kenar1 == kenar2 || kenar1==kenar3 || kenar2==kenar3)
    {
        println("girdiğiniz üçgen ikizkenar üçgendir.")
    }
    else
    {
        println("girdiğiniz üçgen çeşitkenar üçgendir.")
    }

}

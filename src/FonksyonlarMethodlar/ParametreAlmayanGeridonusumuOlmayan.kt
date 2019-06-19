package FonksyonlarMethodlar

fun main(args: Array<String>) {
    //isimyazdır()
    ismiparametreileyazdır("abdulkadir ilhan",29)
    menuGoster()


}

fun ismiparametreileyazdır(isim:String, yas:Int) {
    println(isim)
    println(yas)
}

fun isimyazdır ()
{
    println("Abdulkadir ilhan")
    println("yas 30")
}
fun menuGoster(){

    println("Menu ekranı")
    println("1- Sayıların toplamı için")
    println("2- Sayıların farkı için")
    println("3- sayıların çarpımı için")
}


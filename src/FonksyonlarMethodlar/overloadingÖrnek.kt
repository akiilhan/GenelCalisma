package FonksyonlarMethodlar

/** overloading kullanarak ismini (String Bilgileri), yaş doğum tarhini (Integer
 * degerlerini) kullanarak uyglama yaz
 */
fun main(args: Array<String>) {
bilgiler("abdulkadir","ilhan","kayseri")
    bilgiler(29,1989)
}
fun bilgiler(isim:String,soyisim:String,memleket:String)
{
    println("isminiz: $isim soyadınız: $soyisim memleketiniz: $memleket")
}

fun bilgiler(yas:Int,dogumtarihi:Int)
{
    println("yasınız: $yas dogum tarihiniz: $dogumtarihi")
}


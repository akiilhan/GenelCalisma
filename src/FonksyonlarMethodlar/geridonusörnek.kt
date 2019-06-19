package FonksyonlarMethodlar

// girilen sayının iki katını alan geri dönüşümlü fonksiyon yazınız.
fun main(args: Array<String>) {
    println("lutfen sayıyı giriniz: ")
    var girilenSayi:Int = readLine()!!.toInt()
    var sonuc = ikiKati(girilenSayi)
    println("girilen sayının iki katı: " +sonuc)

}
fun ikiKati(sayi:Int):Int
{
    return sayi*2
}
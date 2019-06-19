package DiziRangeKavramlari

fun main(args: Array<String>) {
    println("isminizi giriniz: ")
    var isim: String? = readLine()
    println("soyadınızı giriniz: ")
    var soyisim : String = readLine() !!
    println("yasinizi giriniz:")
    var yas = readLine()!!.toInt()
    println("ad: $isim yas: $yas soyad: $soyisim")
}
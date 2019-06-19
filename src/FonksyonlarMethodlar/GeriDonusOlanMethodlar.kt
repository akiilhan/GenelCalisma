package FonksyonlarMethodlar

fun main(args: Array<String>) {
    println(selamver("emre"))


var toplam =topla(5,9)
    println("main fonksyonundaki toplam: "+toplam)
    var sayi= readLine()!!.toInt()
    var hesaplananFaktoriyel = faktoriyelHesapla(sayi)
    println(hesaplananFaktoriyel)
    println(faktoriyelHesapla(sayi))
}
fun topla(sayi1:Int,sayi2:Int) :Int
{
    var t = sayi1 + sayi2
    println("topla fonksyonundaki toplam: " +t)
    return t
}
fun selamver(isim:String):String
{
    return "merhaba " + isim
}
fun faktoriyelHesapla(s:Int) : Int {
    var girilenSayi = s
    var sayac = 1
    var faktoriyel = 1
    while (sayac <= girilenSayi) {
        faktoriyel = faktoriyel * sayac
        sayac++
    }
    return faktoriyel
}


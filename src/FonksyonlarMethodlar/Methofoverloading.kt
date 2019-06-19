package FonksyonlarMethodlar

fun main(args: Array<String>) {
    toplaminibul(4,5)
    toplaminibul(2.3,4.5)
    toplamlarinibul(1,2,3,4,5,6,7,8)
    var sayidizisi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    toplamınıbul(sayidizisi)

}

fun toplamınıbul(sayidizisi: Array<Int>) {
    var toplam = 0
    for(y in sayidizisi) {
        toplam = toplam + y

    }

    println(toplam)
}

/**
 * "toplaminibul" adında aynı fonksiyonu iki kere tanımladık. ilki integer gönderiyor.
 * ikincisi double gönderiyor. buna overloading deniyor.
 */




fun toplaminibul(sayi1:Int,sayi2:Int)
{
    println(sayi1+sayi2)
}
fun toplaminibul(sayi1:Double,sayi2: Double)
{
    println(sayi1+sayi2)
}

fun toplamlarinibul(vararg sayilar:Int )
        /** toplamı bulunacak sayının kaç tane girileceği bilinmiyorsa,
         * vararg kullanılıyor. böylece tek tek girmeye gerek kalmıyor. */


{
    var toplam = 0
    for (i in sayilar)

        toplam += i
    println(toplam)

}
package MathStringArray

import DiziRangeKavramlari.sayi

/**SORU4: Boyutu ve elemanlarını kullanıcının belirlediği bir dizinin
elemanlarının toplam değerini yazınız*/

fun main(args: Array<String>) {
    var toplam =0
    println("boyutu giriniz: ")
    var diziBoyutu = readLine()!!.toInt()
    var eleman = Array<Int>(diziBoyutu){0}

for (i in 0..eleman.size-1)
{
    println("sayi giriniz: ")
    eleman[i] = readLine()!!.toInt()
    toplam = toplam + eleman[i]
    println(toplam)


}


}


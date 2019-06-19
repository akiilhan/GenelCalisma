package MathStringArray

fun main(args: Array<String>) {
    var toplam = 0

    /**var sayı = Array<Int>(3){0}
    for (i in 0..sayı.size-1)
    {
        println("sayi giriniz: ")
        sayı[i]= readLine()!!.toInt()
    }
    for (a in sayı)
    {
        println(a)
    }*/

    println("boyutu giriniz: ")
    var boyut = readLine()!!.toInt()
    var eleman = Array<Int>(boyut){0}
    for (m in 0..eleman.size-1)
    {
        println("elemanları giriniz: ")
        eleman[m]= readLine()!!.toInt()
        toplam = toplam + eleman[m]


    }

}
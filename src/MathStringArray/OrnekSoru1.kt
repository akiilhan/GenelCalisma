package MathStringArray



//SORU1
/**Kullanıcıdan alınan 5 sayıyı diziye atayan ve atama işlemi bittikten
sonra ekrana yazdıran uygulamayı yazınız*/

fun main(args: Array<String>) {

    var kullanicidanGelen = Array (5){0}
    for(index in 0..kullanicidanGelen.size-1)
    {
        println("sayi giriniz: ")
        kullanicidanGelen[index] = readLine()!!.toInt()


    }
for (sayi in kullanicidanGelen)
{
    println(sayi)
}
}





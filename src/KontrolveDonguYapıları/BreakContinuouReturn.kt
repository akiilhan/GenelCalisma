package KontrolveDonguYapıları

fun main(args: Array<String>) {
    // break continue ve return

    for (i in 1..10)
    {
        println(i)

        if (i == 7)
        {
            break // 7 sayısını gördüğünde ekranda gösterme.
        }
    }
for (harf:Char in "abdulkadir86@hotmail.com")
{
    if (harf=='@')
    {
        break

    }
    print(harf)
}
    println("")
// continue komutu döngü belirli bir şart sağlandığında döngünün en başına geri dönüş yapar.
    var toplam = 0
    for (sayi in 1..10)
    {
        if (sayi == 3)
        {
            //return // 3 e geldiğinde ilgili uygulama kapanıyor. fonsyondan çıkar.
        }
        if (sayi ==7)
        {
            continue  //sayi ne zaman 7 ye eşit oldu, o zaman 7 sayısını görmeyip 8'den devam ediyor.

        }
        toplam += sayi
        println("suanki sayı: " +sayi)
        println("suanki toplam deger: " +toplam)
    }

 distakiDongü@ for (i in 4..6)
 {
     for (j in 1..3) {
         if (i * j == 12) {
             break@distakiDongü
         }
             println("$i*$j: " + (i * j))

     }
 }

}
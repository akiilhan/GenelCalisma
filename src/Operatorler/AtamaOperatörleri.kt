package Operatorler

fun main(args: Array<String>) {
    var sayi = 5
    println("sayinin ilk hali: " +sayi)
    //*= atama operatörü
    sayi += 5 // sayi = sayi +5 demek
    println("sayinin son hali: " +sayi)

    // -=
    sayi -= 2 // sayi = sayi -2
    println(sayi) /** sonuç 8 çıktı çünkü, yukarıdaki ilk sayıya "5" 5 eklettik. 10 oldu.
Bu komutta yeni sayı olan 10'dan 2 çıkarttı. Sonuç  8. */

    sayi *= 3
    println(sayi)

    sayi /= 6
    println(sayi)

    sayi %= 3 // sayi = sayi % 3
    println(sayi)

    //Karşılaştırma operatörleri <,>, >=, <=, ==, !=
    var sayi1 = 13
    var sayi2 = 7
    var sonuc:Boolean

    sonuc = (sayi1 == sayi2)
    println(sonuc)
    sonuc = (sayi1 < sayi2)
    println(sonuc)
    sonuc = (sayi1 != sayi2)
    println(sonuc)























}
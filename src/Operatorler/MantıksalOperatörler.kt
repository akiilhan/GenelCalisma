package Operatorler

fun main(args: Array<String>) {

    // mühendis ve 30 yasından küçük olmalı

    var sart1 = true
    var sart2 = true
    println(sart1 && sart2) // && and isleminde tüm kosullar

    // or (veya)
    // 35 yasında veya doktor

    var sart3 = true
    var sart4 = false
    println(sart3 || sart4) // || or demek

    // Değil (not)
    var sart5 = true
    var sart6 = false
    println(!sart5)

    //Arttırma ve Azaltma
    // ++ bir arttırır
    //-- bir azaltır
    var sayi = 16
    sayi++
    println(sayi)

}

package FonksyonlarMethodlar

fun main(args: Array<String>) {
    println("Faktoriyeli hesaplanacak sayı : ")
    var girilenSayi= readLine()!!.toInt()
    var sayac = 1
    var faktoriyel=1
    while (sayac <= girilenSayi){
        faktoriyel=faktoriyel * sayac
        sayac++
    }
    println("$girilenSayi sayısının faktoriyeli : " + faktoriyel)

}

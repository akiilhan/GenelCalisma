package KontrolveDonguYapıları

fun main(args: Array<String>) {
    /**
    var yas: Int = 16

    if (yas > 18)
    {
        println("yasınız 18'den büyüktür. ")
        println("ehliyet alabilirsiniz. ")
    }else if (yas > 15 && yas < 18)
    {
        println("az daha sabret")
    }else
    {
        println("daha cok kucuksun")
    }

    println("program sonu")
    **/
    println("notunuzu giriniz: ")
    var notdegeri:Int = readLine()!!.toInt()

    var karnenotu: Int = 0
   var sonuc= if (notdegeri in 0..44)
    {
        println(" 1 aldın")
        karnenotu = 1
        'A'

    }else if (notdegeri in 45..54)
    {
        println("2 aldın.")
        karnenotu = 2
        'B'
    }else if (notdegeri in 55..69)
    {
        println("3 aldın")
        karnenotu =3
        'C'
    }else if (notdegeri in 70..84)
    {
        println("4 aldın.")
        karnenotu =4
        'D'
    }else if (notdegeri in 85..100)
    {
        println("5 aldın.")
        karnenotu =5
        'E'
    }else
    {
        println("lütfen 0-100 aralıgında bir deger giriniz.")
        'F'
    }
    println("karneye yansıyacak notun degeri $notdegeri ve $sonuc")



}

package NesneyeYönelimliProgramlama

class Dikdörtgen(var en: Int =0,var boy: Int=0) {



    fun dikdörgenHesapla():Int{
        return en * boy
    }
}

fun main(args: Array<String>) {

    var d1:Dikdörtgen = Dikdörtgen(5, 10)

    println(d1.dikdörgenHesapla())

    var d2:Dikdörtgen = Dikdörtgen(6,12)
    println(d2.dikdörgenHesapla())

var d3:Dikdörtgen = Dikdörtgen(boy = 5, en= 9)
    println(d3.dikdörgenHesapla())

    var d4:Dikdörtgen= Dikdörtgen()
    println(d4.dikdörgenHesapla())
    /** d4 için en boy degeri girmedik. Ama yukarıda class'ın içinde
     en ve boy degerlerine 0 degeri verdik.
     Bu şu demek: eğer en ve boy girilmemişse degeri 0 olarak ver.*/



}
package NesneyeYönelimliProgramlama

class Person {
    var isim:String = "abdulkadir"
    var yas:Int = 30
    fun selamver(){
        println("merhaba")
    }
    fun dogumyili() = 2019 - yas

}

fun main(args: Array<String>) {

    var kisi:Person = Person()
    println(kisi.isim)
    println(kisi.yas)
    kisi.selamver()
    println(kisi.dogumyili())
    var kisi2:Person = Person()
    kisi2.isim = "ahmet"
    println(kisi2.isim)
}
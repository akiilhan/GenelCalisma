package KalıtımInheritance

open class Kisi(ad:String,yas:Int,bolum:String){

    var ad:String
   var yas:Int= 0
    var bolum:String

    init {

        this.ad=ad
        this.yas =yas
        this.bolum=bolum
    }

    override fun toString(): String {
        return "Isım: $ad yas:$yas, Bolum: $bolum"
    }

}

fun main(args: Array<String>) {
    var k1:Kisi = Kisi("ali",55,"muhasebe")
    println(k1)
    var k2:Kisi= Kisi("merve",45,"Bilgi Teknolojileri")
    println(k2)
    var k3:bilgiTek= bilgiTek("mustafa",55,"bilgi tek.","ses")
    println(k3)
}
class bilgiTek(ad:String,yas:Int,bolum:String,brans:String):Kisi(ad, yas, bolum) {

    var brans: String

    init {
        this.brans = brans
    }

    override fun toString(): String {
        return super.toString() + "brans: $brans"
    }
}

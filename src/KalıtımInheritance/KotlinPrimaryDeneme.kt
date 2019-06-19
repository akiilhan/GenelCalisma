package KalıtımInheritance

  open class Calisan (isim:String, yas:Int, bolum:String)
{
    var isim:String
    var yas:Int
    var bolum:String

   init {

       println("SF")
       this.isim = isim
       this.yas = yas
       this.bolum=bolum
   }

    override fun toString(): String {
        return "isim: $isim yas:$yas bolum:$bolum"
    }
}

class DisKaynak (isim:String,yas:Int,bolum:String,firma:String):Calisan(isim,yas,bolum)
{
    var firma:String

    init {
        println("ad")
        this.firma = firma
    }

    override fun toString(): String {
        return super.toString() + "firma: $firma"
    }
}



fun main(args: Array<String>) {
    var a1:Calisan = Calisan(isim = "ahmet",yas = 22,bolum = "ss")
    println(a1)
    var a2:DisKaynak = DisKaynak(isim = "asd",yas = 33, bolum = "dsfg ",firma = "ad")
    println(a2)

}
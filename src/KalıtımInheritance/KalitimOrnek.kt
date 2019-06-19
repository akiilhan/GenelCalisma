package KalıtımInheritance

open class Person(isim:String,yas:Int,Isman:Boolean)//primary cons.
 {
     var isim:String
     open var yas:Int =0
     var Isman:Boolean

     init {

         println("person sınıfının initi tetiklendi")
            this.isim =isim
            this.yas=yas
            this.Isman=Isman

     }

     override fun toString(): String {
         var cinsiyet = if (Isman) "erkek" else "kadın" //Isman true ise erkek,false ise kadın

         return "isim: $isim yas: $yas Cinsiyet : $cinsiyet "
     }
}
class ogretmen(isim:String,override var yas:Int,Isman:Boolean,brans:String):Person(isim, yas, Isman)
{
 var brans:String


    init {
        println("ogretmen sınıfının initi tetiklendi")
        if (yas<0){
            yas = 50
        }
        this.brans = brans



    }

    override fun toString(): String {
        return super.toString() + "brans:" +brans



    }
}



fun main(args: Array<String>) {
    var p1:Person = Person("abdulkadir",56,true)
    println(p1)
    var ogr1:ogretmen = ogretmen("ayse",-2,false,"resim")
    println(ogr1)
    var ogr2:ogretmen= ogretmen("salih",42,true,"edebiyat")
    println(ogr2)
    var ogr3:ogretmen= ogretmen("fatih",55,true,"matematik")
    println(ogr3)
}
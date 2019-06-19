package KalıtımInheritance

open class Person2{

    var isim:String
    var yas:Int
    var Isman:Boolean =false

    constructor(isim:String,yas:Int){
        this.isim =isim
        this.yas = yas
    }
    constructor(isim:String,yas: Int,Isman:Boolean):this(isim, yas){
         this.Isman = Isman

    }

    override fun toString(): String {
        var cinsiyet = if (Isman) "erkek" else "kadın"
        return "isim: $isim yas: $yas Cinsiyet : $cinsiyet "
    }
    class Ogretmen2:Person2{

        var brans:String
        constructor(isim: String,yas: Int,Isman:Boolean,brans:String):super(isim, yas, Isman){

            this.brans=brans

        }
        override  fun toString(): String {
            return super.toString() + "brans:" +brans

        }
    }
}


fun main(args: Array<String>) {
    var p1:Person2=Person2("abdulkadir",30,true)
    println(p1.toString())
    var p2:Person2 = Person2("fatma",22)
    println(p2)

}
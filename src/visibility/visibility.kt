/**package visibility
/** bilgi gizliliği için sağlanır.*/
class test(){

    fun testing(){

        var referans:Ulus =Ulus()
        referans.c
        referans.d
    }
}


open class Ulus{

     private var a=1 // ilgili sınıf içinde geçerlidir.
     protected var b=2 //ilgili sınıfta geçerli ve bundan türetilen sınıflarda geçerli
     internal var c=3 // ilgili modülde tanımlıdır sadece.
     public var d=5 // heryerden erişilir.Defaulttur.

     /**override fun test(){

         println(a)
         println(b)
         println(c)
         println(d)
     }*/
     class Turk:Ulus()
     {
         override fun test()
         {
             //println(a) //gorulduğu üzere sadece ilgili sınıfta geçerli.(Ulus sınıfında)
             println(b)
             println(c)
             println(d)
         }

     }

 }*/
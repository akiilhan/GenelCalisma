package KalıtımInheritance

  open class GeometrikSekil()
{
    var en:Int =0
    var boy:Int =0

    open fun alanHesapla()
    {

        println(" Geometrik şekil Alan:" +(en*boy))
    }

    override fun toString(): String {
        return "En: $en Boy: $boy"
    }

}
class kare:GeometrikSekil(){

    override fun alanHesapla() {
        println("Kare Alan:" +(en*boy))
    }


}
class Dikdörtgen:GeometrikSekil(){

    override fun alanHesapla() {
        println("Dikdörtgen Alan:" +(en*boy))
    }
}

fun main(args: Array<String>) {
    var gs1=GeometrikSekil()
    gs1.en = 6
    gs1.boy = 3
   gs1.alanHesapla()

    var k1 =kare()
    k1.en = 6
    k1.boy = 3
    k1.alanHesapla()

    var d1=Dikdörtgen()
    d1.en = 3
    d1.boy = 8
    d1.alanHesapla()

}
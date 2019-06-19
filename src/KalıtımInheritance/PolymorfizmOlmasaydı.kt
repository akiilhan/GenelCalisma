
package KalıtımInheritance

//her bir sınıftaki calıs methodunu tetikle

open class Calisan3 {

    open var pozisyon:String ="calisan"

    open fun calis(){

        println("$pozisyon calısmaya başladı.")
    }
}

open class Mudur:Calisan3(){

    override var pozisyon: String ="mudur"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }

}

class GeneMudur:Mudur(){

    override var pozisyon: String ="Genel Mudur"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }

}

open class programci:Calisan3(){

    override var pozisyon: String ="programci"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }

}

class AnalizProgramci:programci(){

    override var pozisyon: String ="AnalizProgramci"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }
}

class SistemProgramci:programci(){

    override var pozisyon: String ="SistemProgramci"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }
    fun sistemiİncele(){

        println("Sistemi inceliyor")
    }
}

class pazarlamaci:Calisan3(){

    override var pozisyon: String ="pazarlamacı"

    override fun calis() {
        println("$pozisyon calısmaya başladı.")
    }

}

fun main(args: Array<String>) {
    /*var calisanlar=Array<Any>(4){ Any() }
    calisanlar[0]= Calisan3() // yukarı cevrim (Upcasting)
    calisanlar[1]= Mudur()
    calisanlar[2]= programci()
    calisanlar[3]= pazarlamaci()*/

    //mesaiyebasla(calisanlar)
    var calisanlar=Array<Calisan3>(7){Calisan3()}

    calisanlar[0]= Calisan3()
    calisanlar[1]= Mudur()
    calisanlar[2]= programci()
    calisanlar[3]= pazarlamaci()
    calisanlar[4]= GeneMudur()
    calisanlar[5]= AnalizProgramci()
    calisanlar[6]= SistemProgramci()

    mesaiyebaslaPolymorfizm(calisanlar)




}

fun mesaiyebasla(calisanlar: Array<Any>) {

    for (oAnkiCalisan in calisanlar){

        if (oAnkiCalisan is Calisan3){

            var Calisan3:Calisan3 = oAnkiCalisan // asagıya cevrim
            Calisan3.calis()


        }
        else if (oAnkiCalisan is Mudur){

            var mudur:Mudur = oAnkiCalisan
            mudur.calis()
        }

        else if (oAnkiCalisan is pazarlamaci){

            var pazarlamaci:pazarlamaci =oAnkiCalisan
            pazarlamaci.calis()
        }
        else if (oAnkiCalisan is programci){
            var programci:programci = oAnkiCalisan
            programci.calis()
        }

    }

}

fun mesaiyebaslaPolymorfizm(calisanlar: Array<Calisan3>){

    for (oAnkiCalisan in calisanlar){

        oAnkiCalisan.calis()

        if (oAnkiCalisan is SistemProgramci){

            oAnkiCalisan.sistemiİncele()
        }

    }




}







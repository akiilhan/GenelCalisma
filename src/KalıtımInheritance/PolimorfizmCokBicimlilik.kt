package KalıtımInheritance

open class Asker{

    open fun selamver(){

        println("asker selam verdi.")
    }
}

class Er:Asker(){

    override fun selamver() {
        println("Er Selam verdi.")
    }
}
class Yuzbası:Asker(){

    override fun selamver() {
        println("yüzbası selam verdi.")
    }
}

fun main(args: Array<String>) {

    var asker=Asker()
    var er = Er()
    var yuzbası=Yuzbası()
    hazirol(asker)
    hazirol(er)

}

fun hazirol(asker: Asker){

    asker.selamver()


}
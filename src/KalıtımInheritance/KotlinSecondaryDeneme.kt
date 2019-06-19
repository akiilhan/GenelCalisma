package KalıtımInheritance

fun main(args: Array<String>) {
    var c3:calisan2= calisan2(isim = "sdf",yas = 22,bolum = "sdf")
    println(c3)
    var c4:calisan2.diskaynak2 = calisan2.diskaynak2(isim = "asd",yas = 22,bolum = "awd",firma2 = "asd")
    println(c4)
}



open class calisan2{

    var isim:String
    var yas:Int
    var bolum:String

    constructor(isim:String,yas:Int,bolum:String){

        this.isim=isim
        this.yas=yas
        this.bolum=bolum


        }
    override  fun toString(): String {
        return "isim: $isim yas: $yas bolum: $bolum"
    }

    class diskaynak2:calisan2 {
    var firma2:String


        constructor(isim: String, yas: Int, bolum: String, firma2: String) : super(isim, yas, bolum){

            this.firma2=firma2
        }

        override fun toString(): String {
            return super.toString() +"firma2: $firma2"
        }

        }





    }




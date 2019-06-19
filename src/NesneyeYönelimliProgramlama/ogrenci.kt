package NesneyeYönelimliProgramlama

class ogrenci (ad:String,yas:Int) {

    var gelenIsim:String
    var gelenYas: Int

    init { // ne zaman bir nesne üretilmeye başlanıyor. o zaman ilk init calısır.
        this.gelenIsim = ad
        this.gelenYas = yas
        println("init blogu calisti.")
        println("isim: $ad yas: $yas")
    }
/** init blogu nesne oluşturulmadan hemen önce calıstırılır. kontrol yapılır.*/
    fun bilgilerigoster(){
        println("isim: $gelenIsim yas: $gelenYas")
    }
}


fun main(args: Array<String>) {
    var ogr1: ogrenci = ogrenci("emre", 30)
    ogr1.bilgilerigoster()
}
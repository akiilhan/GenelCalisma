package NesneyeYönelimliProgramlama

/**dikdörtgenlerin alanlarını bulan uygulama yaz.*/
class Dikdörtgen1(var en:Int,var boy:Int){

}

fun main(args: Array<String>) {
    var dik1:Dikdörtgen1 = Dikdörtgen1(1,2)
    var dik2:Dikdörtgen1 = Dikdörtgen1(1,3)
    var dik3:Dikdörtgen1 = Dikdörtgen1(1,4)
    var dik4:Dikdörtgen1 = Dikdörtgen1(1,5)
    var dik5:Dikdörtgen1 = Dikdörtgen1(1,6)
     var dikdörtgenler = Array<Dikdörtgen1>(5){ Dikdörtgen1(0,0) }
    dikdörtgenler[0]= dik1
    dikdörtgenler[1]= dik2
    dikdörtgenler[2]= dik3
    dikdörtgenler[3]= dik4
    dikdörtgenler[4]= dik5
    DikdortgenDizi(dikdörtgenler)

}
fun DikdortgenHesapla(dikdortgen:Dikdörtgen1)
{
    println("dikdörtgenin Alanı:" +dikdortgen.en*dikdortgen.boy)
}
fun DikdortgenDizi(dikdortgenDizi:Array<Dikdörtgen1>) {
    for (r in dikdortgenDizi) {
        DikdortgenHesapla(r)
    }
}
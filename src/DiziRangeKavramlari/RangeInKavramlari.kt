package DiziRangeKavramlari

fun main(args: Array<String>) {
//1 ile 20 arasındaki sayılar

    var sayilar = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    //daha kolay yolu

    var sayilar2 = 1..20
    var aDanZye = 'a'..'z'
    var sayilarTerstan = 20..1
    var oneTotwenty = 1.rangeTo(20)
    var downTo = 20.downTo(1)
    //mesela 5er 5er arttırmak için
    var beserbeser = 0.rangeTo(100).step(5)
    println(beserbeser)
}
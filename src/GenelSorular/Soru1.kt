package GenelSorular

fun main(args: Array<String>) {

    // klavyeden girilen 3 sayının ortalamasını bulunuz.

    println("lutfen birinci sayiyi giriniz: ")
    var sayi1:Double = readLine()!!.toDouble()
    println("lutfen ikinci sayiyi giriniz: ")
    var sayi2:Double = readLine()!!.toDouble()
    println("lutfen 3. sayiyi giriniz: ")
    var sayi3:Double = readLine()!!.toDouble()
    var ortalama:Double = ((sayi1+sayi2+sayi3)/3)
    println("3 sayının ortalaması: " + ortalama)
}
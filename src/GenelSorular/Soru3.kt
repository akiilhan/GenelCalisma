package GenelSorular

fun main(args: Array<String>) {
    // klavyeden girilen ve final notlarına göre öğrencinin dersi geçip geçmediğini söyleyen bir uygulama yazınız.
    // (geçme notu: 50 vizenin yüzde 40'ı, finalin yüzde 60'ı geçerlidir.
    println("vize notunu giriniz: ")
    var vize:Double = readLine()!!.toDouble()
    println("final notunu giriniz: ")
    var final:Double = readLine()!!.toDouble()
    var vizeOrtalama:Double
    var finalOrtalama:Double
    var toplam:Double

    vizeOrtalama = ((vize*40)/100)
    finalOrtalama = ((final*60)/100)
    toplam = vizeOrtalama+finalOrtalama
    if (toplam>=50)
    {
        println("tebrikleri dersi geçtiğiniz. Aldığınız not: $toplam")
    }
    else
    {
        println("maalesef dersi geçemediniz. Aldığınız not: $toplam")
    }


}
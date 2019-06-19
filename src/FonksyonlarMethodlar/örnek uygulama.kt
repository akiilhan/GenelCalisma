package FonksyonlarMethodlar

// kullanıcıya bir menu görecek. bu menuden 1'e bastıgında verdiği iki sayının toplamı,
// 2 için çarpımı 3 için bölümü gösterecek uygulama yazınız.
fun main(args: Array<String>) {

    while(true) { // while içine almamızın nedeni: kullanıcı 5(cıkıs)'a basmadığı sürece menu gelsin.
        var kullanıcısecimi = menulerigoster()

        if (kullanıcısecimi==5){ // 5 'e basarsa programdan cıksın.
            println("başarılı bir şekilde cıkıs yaptınız.")
            break
        }
        if (kullanıcısecimi in 1..4)
        {
            println("Birinci sayıyı giriniz: ")
            var sayi11: Double = readLine()!!.toDouble()
            println("ikinci sayiyi giriniz: ")
            var sayi22: Double = readLine()!!.toDouble()
            when (kullanıcısecimi) {
                1 -> toplamayap(sayi11, sayi22)
                2 -> cıkarmayap(sayi11, sayi22)
                3 -> carpmayap(sayi11, sayi22)
                4 -> bolmeyap(sayi11, sayi22)

            }
        }
else
        {
            println("hatalı giriş")
        }


    }
}
fun menulerigoster():Int
{
    println("*****MENU*****")
    println("1-sayıların toplamı için 1'e basınız.")
    println("2-sayıların farkı için 2'ye basınız.")
    println("3-sayıların çarpımı için 3'e basınız.")
    println("4-sayıların bölümü için 4'e basınız.")
    println("5-çıkmak için 5'e basınız.")
    println("seçiminiz: ")

    var secim = readLine()!!.toInt()
    return secim

    }
fun toplamayap(sayi11:Double,sayi22:Double)
{
    println("Sayıların toplamı: " +(sayi11+sayi22))
}
fun cıkarmayap(sayi11:Double,sayi22:Double) {
    println("Sayıların farkı: " +(sayi11-sayi22))
}
fun carpmayap(sayi11:Double,sayi22:Double) {
    println("Sayıların carpimi: " +(sayi11*sayi22))
}
fun bolmeyap(sayi11:Double,sayi22:Double) {

    if (sayi22.toInt() != 0)
    {
        println("Sayıların bölümü: " +(sayi11/sayi22))

    }
    else
    {
        println("sayi sıfıra bölünemez.")
    }

}











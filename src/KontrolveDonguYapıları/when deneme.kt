package KontrolveDonguYapıları

fun main(args: Array<String>) {
    println("kilonuzu giriniz: ")
    var kilo:Int = readLine()!!.toInt()
    var sonuc2:Int = when(kilo)
    {
        in 50..60 ->
        {
            println("ideal kilodasınız")
            1
        }
        in 61..70 ->
        {
            println("az kilolusunuz.")
            2
        }
        in 71..100 ->
        {
            println("kilolusunuz")
            3
        }
        in 101..150 ->
        {
            println("cok kilolusunuz")
            4
        }
        else ->
        {
            println("yanlıs deger girdiniz")
            -1
        }



    }

if (sonuc2== -1)
{
    println("lütfen dogru deger giriniz")
}
}
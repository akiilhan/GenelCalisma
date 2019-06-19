package KontrolveDonguYapıları

fun main(args: Array<String>) {
    println("lütfen not degerini giriniz:")

    var notdegeri:Int = readLine()!!.toInt()
     var sonuc:Int = when(notdegeri)
    {
        in 0..44 ->
        {            println("1 aldın")
            1
        }
         in 45..54 ->
         {
             println("2 aldın")
             2
         }
         in 55..74 ->
         {
             println("3 aldın")
             3
         }
         in 75..84 ->
         {
             println("4 aldın")
             4
         }        in 85..100 ->
         {
             println("5 aldın")
             5

         }


         else ->
         {
             println("0 100 arası deger girin")
             -1
         }

    }
    if (sonuc == -1)
    {
        println("yanlıs giris yaptınız")
    }
}
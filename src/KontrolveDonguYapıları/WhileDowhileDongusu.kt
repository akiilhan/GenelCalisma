package KontrolveDonguYapıları

fun main(args: Array<String>) {
   /** for (i in 1..10)
    {
        println(i)
    }
    var i:Int =1
    while (i<=10) // while daha cok dosyalama işlemlri için kullanılır. Database acık olduğu sürece su işlemleri yap gibi.
    {
        println(i)
        i = i+1 // ya da i++ kullanabilirsin.
    }

    // 1 ile yüz arasındaki çift sayıların toplamını bulunuz.
    var toplam = 0
    for (p in 1..100)
    {
        if (p % 2 == 0)
            toplam = toplam + p

    }
    println(" çift sayıların toplamı:" +toplam) */

    /**Aynısını while ile yapalım */
    var k = 1
    var ciftSayiToplamı = 0
    while (k<=100)
    {
        k = k +1
        if (k % 2 == 0)
        {
            ciftSayiToplamı = ciftSayiToplamı +k

        }

    }
    println("toplam: $ciftSayiToplamı")

    //do while ve while farkı

    var e = 1
while (e<1) //1 küçük 1 den olmadığı için bu ifade basılmaz.
{
    println(e)
    e++
}
    println("while sonu")

    var f =1
    do {
        println("do while caslıstı. f: " +f)  //bu sekilde while komutuna bakılmaksızın do bir kere calısıyor. ardından while komutuna bakılıyor.
    }
        while (f<1)
    {
        println("asd")
    }
}
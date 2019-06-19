package MathStringArray

fun main(args: Array<String>) {

    println(Math.E)
    println(Math.PI)
    println(Math.abs(-9)) //girilen sayının mutlak değerini verir.
    println(Math.ceil(8.9)) // girilen noktalı ifadeyi,bir üst sayıya yuvarlar.
    println(Math.floor(8.9)) // girilen noktalı ifadeyi,bir alt sayıya yuvarlar.
    println(Math.pow(2.0,4.0)) //2 üssü 4 demek
    println(Math.pow(5.0,2.0)) // 5 üssü 2
    println(Math.sqrt(9.0)) // sayının kökünü alır.
    println(Math.max(8,4)) // girilen sayının maximum olan degerini verir.
    println(Math.min(8,4)) // girilen sayının minimum olan degerini verir.
    println((Math.random()*100).toInt()) /** 0 ile 1 arası bir deger üretir.
100 ile çarpıp 0 100 arası sayı elde ederim. Int'e çevirip tam sayı bulurum.*/


    //soru1: dik kenarları x olan ikiz kenar ücgenin alanını bulunuz.

    println("dik kenar uzunluğunu giriniz: ")
    var kenar:Double = readLine()!!.toDouble()
    var alan:Double = ((Math.pow(kenar,2.0))/2.0)
    println("alanı: $alan")
    /**soru2: 0 ile 50 arasındaki herhangi iki sayının önce büyügünü sonra küçüğünü
    yazdırınız.*/

    var sayi1:Int = ((Math.random()*50)).toInt()
    var sayi2:Int = ((Math.random()*50)).toInt()
    println("sayi1: $sayi1 sayi2: $sayi2")
    println("maximum sayi:" + Math.max(sayi1,sayi2))
    println("minimum sayi:" + Math.min(sayi1,sayi2))

}

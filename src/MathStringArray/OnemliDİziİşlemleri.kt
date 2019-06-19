package MathStringArray

import java.util.*
import kotlin.collections.ArrayList


fun main(args: Array<String>) {

    /** *****Dizi Kopyalama*****/


    var dizi1 = arrayOf(5,1,90,2,72)
    var dizi2 = Array<Int>(5){0}

    /**for (i in 0..dizi1.size-1)
    {
        dizi2[i]=dizi1[i]
    }
    for (sayi in dizi2 )
    {
        println(sayi)
    }*/
    /**bu işlemin kolay yolu:*/
    System.arraycopy(dizi1,0,dizi2,0,5)
    /**srcPos:dizi1 nereden başayacak. DestPos:dizi2 nereden başlayacak
    lengt bu dizi kaç elemandan oluşuyor.*/
    for (sayı in dizi2)
    {
        println(sayı)
    }
    println("**********")

    /** *****Dizi Sıralama*****/
    Arrays.sort(dizi2)
    for (a in dizi2)
    {
        println(a) // sayılar küçükten büyüğe sıralandı
    }

    /** Dizi Karşılaştırma ******/

    println(Arrays.equals(dizi1,dizi2))
    //Dizi2 "dizi sıralama" işleminde küçükten büyüğe sıralandığı
    // için artık değişmiş oldu.Bu komutla iki dizinin birbirine eşit
    // olup olmadığını kontrrol etmiş olduk.


    /** Array'e ekleme yapma*/
var isimler = arrayListOf("ali","emre","zeynep")
    isimler.add("melek") //ister bu sekilde arraya ekleme yapabilirsin.
    isimler.add(0,"ayşe")// ister bu sekilde yapabilirsin.
    // dikkat edersen ilk başa Ayşe yazdı. Çünkü sıfırıncı element'e Ayşe'yi ekledik.
    for (isim in isimler)
    {

        println(isim)
    }
    println("*******")
println(isimler.get(1)) //1. indexi getir.
    println("*****")
    println(isimler.size) /// Arrayde kaç elemanı olduğunu gösterir.
    //println(isimler.remove(0))
    //println(isimler.clear())
    isimler.set(0,"yeni deger")
    println(isimler)
}
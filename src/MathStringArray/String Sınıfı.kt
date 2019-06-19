package MathStringArray

fun main(args: Array<String>) {
 var isim = "abdulkadir"
    var yas = "29" // yas değeri burada string bir ifade.
    println(yas + 1)/**bu sekilde yaparsan str ifadeye 1 eklemeye calısıyorum.
                       bu sekilde sonuç "291" çıkar.*/
    println(yas.toInt()+ 1) /** yas ifadesini Int'e çevirirsem.
                                toplama işlemi gerçekleşir.*/
    println("isim: $isim yas: " +yas)
    for (tekarakter in isim)
    {
        println(tekarakter)
    }
    for (i in 0..isim.length-1){
        /** burada yapılan işlem, her harfi i değerine ata ve yaz. "-1" yazılmasının
         * nedeni, 0'dan başlayacağı için harf sayısının bir eksiği olarak yazılıyor.
         * eğer -1 yazılmazsa son harften sonra bir değer daha bekler ve
         * o değer olmadığı için hata alırız.*/
        print(isim[i])

    }
    var takim = "galatasaray"
    println(takim)
    println("galata"+"saray")
    println(takim.length) // galatasaray kelimesinin uzunluğunu verir.
    println(takim.get(4)) // 3. karakteri gösterir. (0'dan başlıyor)
    println(takim.substring(0,6)) // ilk 6 karakteri göster.
    println(takim.indexOf('s')) // s harfinin kacıncı indexte olduğunu gösterir.
    println(takim.lastIndexOf('a'))// a harfinin gectiği son index numarası
    println(takim.replace('g','m')) /** g harfini m ile değiştirir.
bu işlem anlık bir işlemdir. yani takım değeri malatasaray olmadı.*/
    println(takim.toUpperCase())
    println(takim.toLowerCase())
    /** girilen değişkeni büyük ya da kücük harf yapar.*/

}

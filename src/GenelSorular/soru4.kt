package GenelSorular

fun main(args: Array<String>) {
    // kendi adınızı ekrana 5 defa yazdıran uygulamayı tüm döngü ifadeleriyle yazdırın.

    var isim= "abdulkadir"
    for (i in 1..5)   //for döngüsüyle
    {
        println(isim)
    }
    println("*******")
var i = 0
    while (i<=10)    //while döngüsüyle
    {
        i++
        println(isim)
        if (i==5)
            break
    }
    println("****")


}
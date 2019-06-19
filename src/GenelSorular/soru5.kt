package GenelSorular

fun main(args: Array<String>) {
    // 1'den 100'e kadar olan sayıların kareleri toplamını bulan uygulamayı yazınız.
    var toplam = 0
    for (i in 1..100) {
        toplam = toplam + (i*i)
        if (i==100){
            println(toplam)
        }

    }

}
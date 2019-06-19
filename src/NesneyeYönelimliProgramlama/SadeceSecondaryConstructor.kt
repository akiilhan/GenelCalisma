package NesneyeYönelimliProgramlama

class kare{

    var tekKenar:Int = 0
    constructor(){

        this.tekKenar = 0
    }

    constructor(kenar: Int){
        this.tekKenar =kenar
    }

    fun kareninAlaniniHesapla():Int
{
    return tekKenar*tekKenar
}
}

fun main(args: Array<String>) {
    var k1 = kare()
    println(k1.kareninAlaniniHesapla())

    var k2 = kare(2)
    println(k2.kareninAlaniniHesapla())
}
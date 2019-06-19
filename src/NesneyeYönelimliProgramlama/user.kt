package NesneyeYönelimliProgramlama

/** Kullanıcıya id ve isim girmesini istedik fakat bazı kullanıcılar
 * adreside girmek isterse secondary constructor kullanmak gerekir.*/


class User(var id: Int, var isim: String) {
    var adres:String="" // boşta olsa deger girmelisin. null almamak için.
    var mail:String=""

    init {
        if (id<0)
        {
            id=1
        }
        println("id: $id isim: $isim adres: $adres, mail: $mail")

    }

    constructor(id: Int,isim: String,adres:String):this(id,isim){
        this.adres =adres
    }
    constructor(id: Int,isim: String,adres: String,mail:String):this(id,isim){
        this.mail= mail
    }

}

fun main(args: Array<String>) {
    var emre:User = User(100, "emre")
    var yunus:User = User(101,"yunus")
    var ahmet:User = User(-5,"ahmet","ankara")
    var salih:User = User(6,"salih","izmir","salih@hotmail.com")

}

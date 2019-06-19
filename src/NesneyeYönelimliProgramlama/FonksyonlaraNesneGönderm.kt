package NesneyeYönelimliProgramlama

class Daire(var yaricap:Int){


}

fun main(args: Array<String>) {
    var d1: Daire = Daire(5)
    //daireAlanı(d1)
    //println("d1'in alanı" + d1.yaricap * d1.yaricap * Math.PI)
    var d2: Daire = Daire(6)
    //daireAlanı(d2)
    //println("d2'in alanı" + d2.yaricap * d2.yaricap * Math.PI)
    var d3:Daire = Daire(7)

    var d4:Daire = Daire(8)
    var d5:Daire = Daire(9)
    var daireler =Array<Daire>(5){Daire(0)}
    daireler[0] =d1
    daireler[1]=d2
    daireler[2]=d3
    daireler[3]=d4
    daireler[4]=d5
    DaireDizisiGoster(daireler)

    /** herbir daire için printf ile hesap yaptırmak yerine,
     * bir dairealanı diye fonksiyon yapsam daha kolay olur.*/

    /**printlnleri kapattım çünkü o hesabı artık daireAlanı fonksyonu yapacak.*/
}
fun daireAlanı(daire:Daire){
    println("Dairenin Alanı: " +daire.yaricap*daire.yaricap*Math.PI)

}
fun DaireDizisiGoster(DaireDizisi:Array<Daire>)
{
    for (daire in DaireDizisi)
    {
        daireAlanı(daire)
    }
}

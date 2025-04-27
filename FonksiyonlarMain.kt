package nesne_tabanli

fun main() {
    val f = Fonksiyonlar()
    f.selamla1()  // void

    val gelenSonuc = f.selamla2()
    println("Gelen Sonuç : $gelenSonuc") // return

    f.selamla3(isim = "Zeynep")
    f.topla(10,20)
    f.topla(10,20,"beyza")



}
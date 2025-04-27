package nesne_tabanli

class Fonksiyonlar {
    // void sadece işlem yaparsa
    fun selamla1() {
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    // return hem işlem hem veri transferi yaparsa

    fun selamla2() : String {
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }

    //parametre

    fun selamla3(isim : String) {

        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //overriding (bir sınıf içindeki fonksiyonla aynı isimde başka fonksiyon yapmak)

    fun topla(sayi1:Int,sayi2:Int) {

        println("Toplama ${sayi1+sayi2}")
    }

    fun topla(sayi1:Int,sayi2:Int,isim:String) {

        println("Toplama ${sayi1+sayi2} - İşlem yapan : $isim")
    }
}
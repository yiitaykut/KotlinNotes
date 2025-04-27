package nesne_tabanli

class Yemekler(var id: Int, var ad: String, var fiyat: Int) { // classtan önce data yazarsak veritabanı için fayda sağlıyor
    //constructor / init fonksiyonu
    // Bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("***** Nesne oluştu *****")   // her nesne oluştuğunda bu çalışacak
    }
    fun bilgiAl(){
        println("------")
        println("Id : ${id}")
        println("Ad : ${ad}")
        println("Fiyat : ${fiyat}")
    }
        //this : bulunduğu sınıfı temsil eder.Swift dilinde selftir
        //super : kalıtım ile bir üst sınıfı temsil eder

}
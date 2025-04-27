package nesne_tabanli.kalitim

open class Hayvan {  // open demek özellik aktaracak demek
    open fun sesCikar() {
        println("Ses Çıkar")   // başına open eklersek alt sınıflarda kullanabilirim fonksiyonu
    }
}
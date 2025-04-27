package nesne_tabanli.kalitim

class Kedi : Memeli() {
    override fun sesCikar() {
        // super.sesCikar() -> super üst sınıfı temsil eder (bunu kapatınca üstteki fonksiyon çalışmıyor)
        println("Miyav")
    }
}
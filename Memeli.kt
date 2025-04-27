package nesne_tabanli.kalitim
// memeli subclass hayvan super class
open class Memeli : Hayvan() {  // open demek özellik aktaracak demek
    override fun sesCikar() {  // bu şekilde alıyorsun üstten bir fonksiyonu
        super.sesCikar()
    }
}
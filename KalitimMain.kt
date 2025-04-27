package nesne_tabanli.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar()
    memeli.sesCikar()
    kedi.sesCikar()
    kopek.sesCikar()
}

// down ve up casting yapabilmemiz için kalıtım olması lazım
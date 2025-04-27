package nesne_tabanli

fun main() {
    ucretHesapla(KonserveBoyut.ORTA, 100)
}

fun ucretHesapla(boyut: KonserveBoyut, adet:Int) {
    when(boyut){
        KonserveBoyut.KUCUK -> println("Ücret : ${adet * 104}")
        KonserveBoyut.ORTA -> println("Ücret : ${adet * 287}")
        KonserveBoyut.BUYUK -> println("Ücret : ${adet * 389}")
    }

}
package nesne_tabanli

fun main() {
    val sonuc = 5.carp(2)
    val sonuc1 = 5 topla(3)
    println(sonuc)
    println(sonuc1)
}
// burda integer classına carp fonksiyonu ekledik
// this dediğimiz yukardaki 5'e denk geliyor
fun Int.carp(sayi:Int) : Int{
    return this * sayi
}

//başına infix eklersek "." yazmak zorunda olmuyoruz
infix fun Int.topla(sayi:Int) : Int{
        return this + sayi
}

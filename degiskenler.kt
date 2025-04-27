package degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4780
    var stokDurum = true

    println("id : $id " )
    println("ad : $ad")     // string + değişken adını yazmak
    println("resim : $resim")
    println(puan)
    println(fiyat)
    println(stokDurum)


    var sayi = 30
    sayi = 100      // değiştirebiliyoruz
    println(sayi)

    val numara = 50 // değiştiremiyoruz


    // sayısalsan sayısala dönüşüm

    val d = 34.56
    val sonuc1 = d.toInt()  // direkt .56'yi siliyor yuvarlama yok
    println(sonuc1)


    // sayısaldan metine dönüşüm ( arayüzlerde sayı girilecekse o string olmalı)

    val x = 85
    val sonuc2 = x.toString()
    println(sonuc2)


    // metinden sayısala dönüşüm

    val yazi = "48" // 48t gibi bir şey olsaydı hata verirdi
    val sonuc3 = yazi.toInt()
    println(sonuc3)

    val yazi1 = "48t"
    val sonuc4 = yazi1.toIntOrNull() // böyle bir fonksiyon da var uygulamanın çökmemesi için
    println(sonuc4)




}



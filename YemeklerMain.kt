package nesne_tabanli

fun main() {
    val y1 = Yemekler(100,"köfte",249)

    println("------")
    println("Id : ${y1.id}")
    println("Ad : ${y1.ad}")
    println("Fiyat : ${y1.fiyat}")

    y1.fiyat = 350

    println("Fiyat : ${y1.fiyat}")

    println("------")
    val y2 = Yemekler(200,"ayran",300)
    println("Id : ${y2.id}")
    println("Ad : ${y2.ad}")
    println("Fiyat : ${y2.fiyat}")

    y2.ad = "Tavuk"

    println("Ad : ${y2.ad}")


    y1.bilgiAl()

    y1.fiyat = 350

    y1.bilgiAl()   // bu üsttekinin kolaylaşmış hali

    y2.bilgiAl()

    y2.ad = "Tavuk"

    y2.bilgiAl()

}
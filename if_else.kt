package if_else_donguler

fun main() {
    val yas = 19
    println(yas >= 18)
    if (yas >= 18) {
        println("Reşitsiniz")
    }else {
        println("Değilsiniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if( ka == "admin" && s ==123456) {     // ve yapıyoruz bununla
        println("başarılı")
    }
    else {
        println("Başarısız")
    }

    if (sayi == 9 || s == 123456) {         // veya yapıyoruz bununla
        println("Okey")
    }
    else {
        println("Basarısız")
    }

    val number = 5
    // when ( diğer dillerde switch )
    when(number) {
        1 -> println("1")
        2 -> println("2")
        else -> println("İkisi de değil")
    }


}
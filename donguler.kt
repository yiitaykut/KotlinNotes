package if_else_donguler

fun main() {
    for(i in 1 ..3 ) {     // 1-3 arasını yazıyor
        println("Döngü 1 : $i")
    }

    for(x in 10..20 step 5) {   // 10'dan 20' ye 5 er 5 er yazıyor
        println("Döngü 2 : $x")
    }

    for(y in 20 downTo 10 step 5) {  // 20'den 10'a 5 er 5 er yazıyor
        println("Döngü 3 : $y")
    }

    var sayac = 1
    while (sayac < 4) {
        println("Döngü 4 : $sayac")
        sayac += 1

    }

    for(i in 1 ..5 ) {
        if(i==3) {
            break
        }
        println("Döngü 5 : $i")
    }

    for(i in 1 ..5 ) {
        if(i==3) {
            continue
        }
        println("Döngü 6 : $i")
    }
}
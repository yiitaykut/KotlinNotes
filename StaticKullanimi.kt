package nesne_tabanli

fun main() {
    val a = ClassStatic()
    // Standart nesne tabanlı erişim
    //println(a.x)
    //a.metod()

    // Sanal nesne - Virtual Object
    //println(ClassA().x) // 1. nesne
    //ClassA().metod() // 2. nesne

    // üstteki daha ideal kullanım

    println(ClassStatic.x)   // bu statik kullanımı üsttekinden farkı parantez olmaması
    ClassStatic.metod()
}
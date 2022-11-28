import data.Car
import data.Rectangle

fun main(args: Array<String>) {
    //initializer block adalah block kode yang akan di eksekusi ketika constructor dipanggil
//    val avanza = Car("Toyota")
//    avanza.year = 2015
//    val almaz = Car("Wuling")
//    almaz.year = 2020
//    println(avanza.year)
//    println(avanza.brand)

//kadang kita ingin mengakses function atau properties milik class parent yang sudah dibuat ulang oleh class child
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")
}

import data.Car

fun main(args: Array<String>) {
    //initializer block adalah block kode yang akan di eksekusi ketika constructor dipanggil
    val avanza = Car("Toyota")
    avanza.year = 2015
    val almaz = Car("Wuling")
    almaz.year = 2020
    println(avanza.year)
    println(avanza.brand)
}

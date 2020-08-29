package volumeTabung.Challenge
import java.util.*

fun main() {
    var jari: Float
    var tinggi: Float
    var volumepi: Float
    val reader = Scanner(System.`in`)
    print("Masukkan Jari jari alas Tabung: ")
    jari = reader.nextFloat()
    print("Masukkan Tinggi Tabung: ")
    tinggi = reader.nextFloat()
    volumepi = hitungVolume(jari, tinggi)
    val s = String.format("%.2f", volumepi)
    println("===========================")
    print("Jadi Volume Tabung = $s")
}
fun hitungVolume(r: Float, t: Float): Float {
    return t * r * r * 22 / 7
}
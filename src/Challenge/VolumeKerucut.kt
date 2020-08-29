package volumeKerucut
import java.util.*

fun main() {
    var r: Float
    var t: Float
    var volumepi: Float
    val reader = Scanner(System.`in`)
    print("Masukkan Jari jari alas Kerucut: ")
    r = reader.nextFloat()
    print("Masukan tinggi Kerucut: ")
    t = reader.nextFloat()
    volumepi = ((t * r * r * 22 * 1 / 7) / 3)
    val s = String.format("%.2f", volumepi)
    println("===========================")
    print("Jadi Volume Kerucut = $s")
}
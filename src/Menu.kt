package Challenge

import java.util.*

fun main() {

    val input = Scanner(System.`in`)

    print("Name : ")
    input.nextLine()

    print("kelas : ")
    input.nextLine()

    print("No Absen : ")
    input.nextInt()
    println("===========================")
    println("Kamu Ingin Menghitung apa?")
    println("1. Volume Kerucut")
    println("2. Volume Tabung")
    println("0. Batal")
    println("===========================")
    print("Pilihanmu : ")

    when (input.nextInt()) {
        1 -> {
            (volumeKerucut.main())
            println("")
            return main();
        }
        2 -> {
            (volumeTabung.Challenge.main())
            println("")
            return main();
        }
        0 -> {
        }
    }

}
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstLetter = scanner.nextLine().first()
    val secondLetter = scanner.nextLine().first()

    if (firstLetter.lowercase() != secondLetter.lowercase()) {
        println("false")
    } else {
        println("true")
    }
}
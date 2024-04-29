import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val number = scanner.nextInt()
    val character = scanner.next().first()

    if (number == character.code) {
        println(true)
    } else {
        println(false)
    }
}
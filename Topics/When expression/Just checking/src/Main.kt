import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val language = scanner.nextInt()

    when (language) {
        2 -> {
            println("Yes!")
        }
        1, 3, 4 -> {
            println("No!")
        }
        else -> {
            println("Unknown number")
        }
    }
}
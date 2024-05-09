import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstString = scanner.nextLine()
    val operator = scanner.nextLine()
    val secondString = scanner.nextLine()

    when (operator) {
        "equals" -> {
            if (firstString == secondString) {
                println(true)
            } else {
                println(false)
            }
        }
        "plus" -> {
            println(firstString + secondString)
        }
        "endsWith" -> {
            if (firstString.endsWith(secondString)) {
                println(true)
            } else {
                println(false)
            }
        }
        else -> {
            println("Unknown operation")
        }
    }
}
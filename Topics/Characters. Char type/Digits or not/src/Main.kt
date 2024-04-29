import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstCharacter = scanner.next().first()
    val secondCharacter = scanner.next().first()
    val thirdCharacter = scanner.next().first()
    val fourthCharacter = scanner.next().first()

    if (firstCharacter.isDigit()) {
        println(true)
    } else {
        println(false)
    }

    if (secondCharacter.isDigit()) {
        println(true)
    } else {
        println(false)
    }

    if (thirdCharacter.isDigit()) {
        println(true)
    } else {
        println(false)
    }

    if (fourthCharacter.isDigit()) {
        println(true)
    } else {
        println(false)
    }

}
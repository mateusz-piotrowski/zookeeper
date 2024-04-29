import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstCharacter = scanner.next().first()
    val secondCharacter = scanner.next().first()
    val thirdCharacter = scanner.next().first()
    val fourthCharacter = scanner.next().first()

    println((firstCharacter.code - 1).toChar())
    println((secondCharacter.code - 1).toChar())
    println((thirdCharacter.code - 1).toChar())
    println((fourthCharacter.code - 1).toChar())

}
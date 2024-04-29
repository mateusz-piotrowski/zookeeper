import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.next().first()
    val secondNumber = scanner.next().first()
    val thirdNumber = scanner.next().first()

    if (firstNumber.code + 1 == secondNumber.code && secondNumber.code + 1 == thirdNumber.code) {
        println(true)
    } else {
        println(false)
    }
}
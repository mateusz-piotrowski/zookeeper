import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val thirdNumber = scanner.nextInt()

    if (firstNumber in secondNumber..thirdNumber) {
        println(true)
    } else {
        println(false)
    }
}
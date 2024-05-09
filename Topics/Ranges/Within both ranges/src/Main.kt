import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val firstNumber = scanner.nextInt()
    val secondNumber = scanner.nextInt()
    val thirdNumber = scanner.nextInt()
    val fourNUmber = scanner.nextInt()
    val fifthNumber = scanner.nextInt()

    val firstRange = fifthNumber in firstNumber..secondNumber
    val secondRange = fifthNumber in thirdNumber..fourNUmber

    if (fifthNumber in firstNumber..secondNumber && fifthNumber in thirdNumber..fourNUmber) {
        println(true)
    } else {
        println(false)
    }
}
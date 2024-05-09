import java.util.*

fun main(args: Array<String>) {
    // Scanner object to get user input
    val reader = Scanner(System.`in`)

    // Read a number from the input
    val number = reader.nextInt()

    // TODO: Check if the number is in the range [10, 200] and print the result
    if (number in 1..200) {
        println("In range")
    } else {
        println("Not in range")
    }
}
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val shapeNumber = scanner.nextInt()

    when (shapeNumber) {
        1 -> {
            println("You have chosen a square")
        }
        2 -> {
            println("You have chosen a circle")
        }
        3 -> {
            println("You have chosen a triangle")
        }
        4 -> {
            println("You have chosen a rhombus")
        }
        else -> {
            println("There is no such shape!")
        }
    }
}
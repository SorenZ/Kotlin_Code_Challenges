import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val output = when (scanner.nextInt()) {
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "move right"
        0 -> "do not move"
        else ->"error!"
    }

    println(output)
}
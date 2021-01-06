import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    for (i in 'z' downTo 'e' step 200) {}

    val line1 = scanner.nextLine()
    val op = scanner.nextLine()
    val line2 = scanner.nextLine()

    when (op) {
        "equals" -> print(line1 == line2)
        "plus" -> print(line1 + line2)
        "endsWith" -> print(line1.endsWith(line2))
        else -> print("Unknown operation")
    }

}
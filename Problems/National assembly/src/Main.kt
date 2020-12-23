import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val pop = scanner.nextDouble()

    val result = Math.cbrt(pop);

    println(result.toInt());

}
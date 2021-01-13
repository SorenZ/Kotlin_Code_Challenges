import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()

    val array = IntArray(a);
    for (i in array.indices) array[i] = scanner.nextInt()

    val maxId = array.max()?.let { array.indexOf(it) }

    println(maxId)
}
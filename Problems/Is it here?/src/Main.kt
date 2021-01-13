import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextLine().toInt()

    val array = IntArray(a);
    for (i in array.indices)
        array[i] = scanner.nextInt()

    val b = scanner.nextInt()

    val result = if(array.contains(b)) "YES" else "NO"

    println(result)

}
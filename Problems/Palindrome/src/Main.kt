fun main() {
    val str:String = readLine()!!
    val revStr = str.reversed()
    println(if (str == revStr) "yes" else "no")
}
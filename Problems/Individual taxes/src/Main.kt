import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()

    val companies = IntArray(a)
    val taxes = IntArray(a)
    for (i in companies.indices) companies[i] = scanner.nextInt()
    for (i in taxes.indices) taxes[i] = scanner.nextInt()

    var max = 0
    var maxId = 0
    for(i in companies.indices){
        val taxOfCompany = companies[i] * taxes[i]
        if(taxOfCompany > max) {
            max = taxOfCompany
            maxId = i
        }
    }


    //val maxId = taxes.max()?.let { taxes.indexOf(it) }

    println(maxId.plus(1))
}
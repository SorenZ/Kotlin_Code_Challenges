class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            field = when {
                value < -92 || value > 52 -> getDefault(name)
                else -> value
            }
        }

    private fun getDefault(city : String) : Int {
        return when (city) {
            "Moscow" -> 5
            "Hanoi" -> 20
            "Dubai" -> 30
            else -> 0
        }
    }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    var city: City
    if (firstCity.degrees < secondCity.degrees) {
        city = if (firstCity.degrees < thirdCity.degrees) firstCity else thirdCity
    }
    else
        city = if (secondCity.degrees < thirdCity.degrees) secondCity else secondCity

    city = when {
        city.degrees == secondCity.degrees && city.degrees == firstCity.degrees -> City("neither")
        city.degrees == secondCity.degrees && city.degrees == thirdCity.degrees -> City("neither")
        city.degrees == firstCity.degrees && city.degrees == thirdCity.degrees -> City("neither")
        else -> secondCity
    }

    //implement comparing here
    print(city.name)
}
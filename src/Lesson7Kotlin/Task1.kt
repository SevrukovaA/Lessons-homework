package Lesson7Kotlin


fun main() {
    print("Enter your number: ")
    val ad: Int = readln().toInt()
    println(intToRoman(ad))
}

fun intToRoman(num: Int): String {
    if (num == 0)
        return ""
    val intArray: IntArray = intArrayOf(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000)
    val charArray: Array<String> = arrayOf("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M")
    var result = ""
    var temp = num
    for (i in intArray.size - 1 downTo 0) {
        while (temp >= intArray[i]) {
            temp -= intArray[i]
            result += charArray[i]
        }
    }
    return result
}
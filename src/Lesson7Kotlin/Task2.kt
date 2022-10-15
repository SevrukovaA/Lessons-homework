package Lesson7Kotlin

fun main() {
    print("Enter the height of the brick: ")
    val height: Int = readln().toInt()

    print("Enter the width of the brick: ")
    val width: Int = readln().toInt()

    print("Enter the length of the brick: ")
    val length: Int = readln().toInt()

    print("Enter the width of the hole: ")
    val widthHole: Int = readln().toInt()

    print("Enter the height of the hole: ")
    val heightHole: Int = readln().toInt()

    if (((height <= heightHole) and (width <= widthHole)) or
            ((height <= widthHole) and (width <= heightHole)) or
            ((height <= heightHole) and (length <= widthHole)) or
            ((height <= widthHole) and (length <= heightHole)) or
            ((width <= heightHole) and (length <= widthHole)) or
            ((width <= widthHole) and (length <= heightHole))) {
        print("Your brick will go through the hole!")
    } else {
        println("Your brick won't go through the hole!")
    }
}
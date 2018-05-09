/**
 * Array
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    val arrayInt = Array(5) { 0 }
    arrayInt[3] = 55
    println("Array[3] = " + arrayInt[3])
    println("All elements by object")

    for (element in arrayInt) {
        println(element)
    }

    println("All elements by index")

    for (index in 0 until arrayInt.size) {
        println("Array[$index] = " + arrayInt[index])
    }

    val arrayStr = Array(4) { "" }

    for (index in 0 until arrayStr.size) {
        print("Enter element at index $index: ")
        arrayStr[index] = readLine()!!
    }

    println("You entered")

    for (element in arrayStr) {
        println(element)
    }
}
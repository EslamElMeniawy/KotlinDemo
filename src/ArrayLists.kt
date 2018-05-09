/**
 * Arraylist
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    val arrayListStr = ArrayList<String>()

    // Add elements
    arrayListStr.add("First string")
    arrayListStr.add("Second string")
    arrayListStr.add("Third string")

    // Get element
    println("Element at index 0 = " + arrayListStr[0])

    // Update element
    arrayListStr[0] = "Replaced first string"

    // Get all elements
    println("All elements")

    for (element in arrayListStr) {
        println(element)
    }

    // Search elements
    if (arrayListStr.contains("Second string")) {
        println("\"Second string\" is found")
    } else {
        println("\"Second string\" is not found")
    }
}
/**
 * Sets
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    // Set
    val setElements = setOf(1, 3, 5, 7, 9, 3, 9, 7, 1)
    println("All elements in set")

    for (element in setElements) {
        println(element)
    }

    // Mutable set
    val mutableSetElements = mutableSetOf(1, 2, 3, 1, 2, 3)
    mutableSetElements.add(4)
    mutableSetElements.add(4)
    println("All elements in mutable set")

    for (element in mutableSetElements) {
        println(element)
    }
}
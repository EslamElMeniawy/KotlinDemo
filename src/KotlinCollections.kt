/**
 * KotlinCollections
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    // Hash map of
    val map = hashMapOf(1 to "first", 2 to "second")
    map[3] = "third"
    println("map[3]: " + map[3])

    // Array of
    val arr = arrayOf(1, 2, 3)
    println("arr[0]: " + arr[0])

    // Array list of
    val arrList = arrayListOf("H", "e", "l", "l", "o")
    arrList.add("!")
    println("arrList[5]: " + arrList[5])

    // List of
    val list = listOf("H", "e", "l", "l", "o")
    println("arrList[5]: " + list.getOrNull(5))

    // Mutable list of
    val mutableList = mutableListOf("H", "e", "l", "l", "o")
    mutableList.add(5, "!")
    println("arrList[5]: " + mutableList[5])
}
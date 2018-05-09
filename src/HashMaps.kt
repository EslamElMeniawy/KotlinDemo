/**
 * HashMaps
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    // Map with Int key
    val mapIntKey = HashMap<Int, String>()

    // Add elements
    mapIntKey[0] = "Element zero"
    mapIntKey[1] = "Element one"
    mapIntKey[2] = "Element two"

    // Get element
    println("Element with key 0 = " + mapIntKey[0])

    // Update element
    mapIntKey[0] = "Element zero updated"

    // Get all elements
    println("All elements")

    for (key in mapIntKey.keys) {
        println("Element with key $key = " + mapIntKey[key])
    }

    // Map with String key
    val mapStrKey = HashMap<String, String>()

    // Add elements
    mapStrKey["zero"] = "Element zero"
    mapStrKey["one"] = "Element one"
    mapStrKey["two"] = "Element two"

    // Get element
    println("Element with key \"zero\" = " + mapStrKey["zero"])

    // Update element
    mapStrKey["zero"] = "Element zero updated"

    // Get all elements
    println("All elements")

    for (key in mapStrKey.keys) {
        println("Element with key \"$key\" = " + mapStrKey[key])
    }
}
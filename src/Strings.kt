/**
 * Strings
 *
 * Created by Eslam El-Meniawy on 08-May-2018.
 */

fun main(args: Array<String>) {
    val name = "Eslam" + " " + "El-Meniawy"
    println("Name: $name")
    println("Second char: " + name[1])
    println("Name in lower case: " + name.toLowerCase())
    println("Name in upper case: " + name.toUpperCase())
    println("Name split on space: " + name.split(" "))
    println("Name trimmed: " + name.trim())
}
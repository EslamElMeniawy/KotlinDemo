/**
 * Inputs
 *
 * Created by Eslam El-Meniawy on 07-May-2018.
 */

fun main(args: Array<String>) {
    print("Enter name: ")
    val name = readLine()
    println("You entered name: $name")
    print("Enter age: ")
    val age: Int = readLine()!!.toInt()
    println("You entered age: $age")
}
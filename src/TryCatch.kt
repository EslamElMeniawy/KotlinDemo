/**
 * TryCatch
 *
 * Created by Eslam El-Meniawy on 13-May-2018.
 */

fun main(args: Array<String>) {
    try {
        print("Enter N2: ")
        val n2: Int = readLine()!!.toInt()
        val div = 100 / n2
        println("Div: $div")
    } catch (ex: Exception) {
        println(ex.message)
    }

    println("App finished")
}
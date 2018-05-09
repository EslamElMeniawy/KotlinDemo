/**
 * Functions
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    var sum = sum(10.0, 10.0)
    display("Sum", sum)
    sum = sum(11.0, 11.0)
    display("Sum", sum)
    sum = sum(12.0, 12.0)
    display("Sum", sum)
    display("Default value")
    bye()
}

fun sum(n1: Double, n2: Double): Double {
    return n1 + n2
}

fun display(key: String, n: Double = 0.0) {
    println("$key: $n")
}

fun bye() {
    println("Bye")
}
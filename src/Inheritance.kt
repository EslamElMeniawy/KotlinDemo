/**
 * Inhertance
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    // First class
    val operations = Operations()
    var sum = operations.sum(10, 5)
    println("Sum: $sum")
    var sub = operations.sub(20, 15)
    println("Sub: $sub")

    // Second class
    val multiOperations = MultiOperations()
    sum = multiOperations.sum(10, 5)
    println("Sum: $sum")
    sub = multiOperations.sub(20, 15)
    println("Sub: $sub")
    val mul = multiOperations.mul(5, 2)
    println("Mul: $mul")
    val div = multiOperations.div(25, 5)
    println("Div: $div")
}

open class Operations {
    fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }
}

class MultiOperations : Operations() {
    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}
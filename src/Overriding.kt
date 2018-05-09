/**
 * Overriding
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    // First class
    val operations = SimpleOperations()
    var sum = operations.sum(10, 5)
    println("Sum: $sum")
    var sub = operations.sub(20, 15)
    println("Sub: $sub")

    // Second class
    val multiOperations = MultipleOperations()
    sum = multiOperations.sum(10, 5)
    println("Sum: $sum")
    sub = multiOperations.sub(20, 15)
    println("Sub: $sub")
    val mul = multiOperations.mul(5, 2)
    println("Mul: $mul")
    val div = multiOperations.div(25, 5)
    println("Div: $div")

    // Casting second class to first class
    val multipleOperations = MultipleOperations() as SimpleOperations
    sum = multipleOperations.sum(10, 5)
    println("Sum: $sum")
    sub = multipleOperations.sub(20, 15)
    println("Sub: $sub")
}

open class SimpleOperations {
    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }
}

class MultipleOperations : SimpleOperations() {
    override fun sum(n1: Int, n2: Int): Int {
        return super.sum(n1, n2) + 1
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}
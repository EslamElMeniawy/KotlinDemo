/**
 * Overload
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    val sum1 = sum(1, 2)
    println("Sum = $sum1")
    val sum2 = sum(1, 2, 3)
    println("Sum = $sum2")
    val sum3 = sum(1, 2, 3, 4)
    println("Sum = $sum3")
}

fun sum(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun sum(n1: Int, n2: Int, n3: Int): Int {
    return n1 + n2 + n3
}

fun sum(n1: Int, n2: Int, n3: Int, n4: Int): Int {
    return n1 + n2 + n3 + n4
}
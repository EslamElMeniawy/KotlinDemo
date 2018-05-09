/**
 * Polymorphism
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    show("Hello!")
    show(10.5)
    show(50)
}

fun show(message: String) {
    println("Message: $message")
}

fun show(integer: Int) {
    println("Integer: $integer")
}

fun show(double: Double) {
    println("Double: $double")
}
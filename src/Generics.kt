/**
 * Generics
 *
 * Created by Eslam El-Meniawy on 10-May-2018.
 */


fun main(args: Array<String>) {
    val userAdminStr = UserAdmins("String credit")
    val userAdminInt = UserAdmins(123)
    val userAdminDouble = UserAdmins(123.55)

    display(123)
    display<String>("Some string")
}

class UserAdmins<T>(credit: T) {
    init {
        println(credit)
    }
}

fun <T> display(process: T) {
    println(process)
}
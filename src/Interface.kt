/**
 * Interface
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    val userOp = UserOp()
    userOp.sum(10, 5)
    userOp.sub(10, 5)
    val adminOp = AdminOp()
    adminOp.sum(10, 5)
    adminOp.sub(10, 5)
    val managerOp = ManagerOp()
    managerOp.sum(10, 5)
    managerOp.sub(10, 5)
}

interface Op {
    fun sum(n1: Int, n2: Int) {
        println("$n1 + $n2 = " + (n1 + n2))
    }

    fun sub(n1: Int, n2: Int)
}

class UserOp : Op {
    override fun sum(n1: Int, n2: Int) {
        println("$n1 + $n2 = " + (n1 + n2))
    }

    override fun sub(n1: Int, n2: Int) {
        println("$n1 - $n2 = " + (n1 - n2))
    }
}

class AdminOp : Op {
    override fun sum(n1: Int, n2: Int) {
        println("$n1 + $n2 + 1 = " + (n1 + n2 + 1))
    }

    override fun sub(n1: Int, n2: Int) {
        println("$n1 - $n2 - 1 = " + (n1 - n2 - 1))
    }
}

class ManagerOp : Op {
    override fun sub(n1: Int, n2: Int) {
        println("$n1 - $n2 = " + (n1 - n2))
    }
}
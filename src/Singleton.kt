/**
 * Singleton
 *
 * Created by Eslam El-Meniawy on 10-May-2018.
 */

fun main(args: Array<String>) {
    val s1 = Singleton.instance
    s1.name = "Eslam"
    println(s1.name)
    val s2 = Singleton.instance
    println(s2.name)
    val s3 = Singleton.instance
    println(s3.name)
}

class Singleton private constructor() {
    var name: String? = null

    companion object {
        val instance: Singleton by lazy { Singleton() }
    }

    init {
        println("Instance created")
    }
}
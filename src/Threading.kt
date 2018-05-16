/**
 * Threading
 *
 * Created by Eslam El-Meniawy on 13-May-2018.
 */

fun main(args: Array<String>) {
    val t1 = MyThread("T1")
    t1.start()

    val t2 = MyThread("T2")
    t2.start()

    val t3 = MyThread("T3")
    t3.start()
    t3.join()
    println("Thread finished")
}

class MyThread(var threadName: String) : Thread() {
    override fun run() {
        println("$threadName started")
        var count = 0

        while (count < 10) {
            println("$threadName count: $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }
}
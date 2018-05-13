import java.io.FileReader
import java.io.FileWriter

/**
 * Files
 *
 * Created by Eslam El-Meniawy on 13-May-2018.
 */

fun main(args: Array<String>) {
    println("Make choice:\n1- Read\n2- Write\n")
    val opr = readLine()!!.toInt()

    when (opr) {
        1 -> readFromFile()
        2 -> {
            print("Enter text to add: ")
            val str: String = readLine().toString()
            writeToFile(str)
        }
    }
}

fun writeToFile(str: String) {
    try {
        val fw = FileWriter("test.txt", true)
        fw.write(str + "\n")
        fw.close()
        println("Data saved")
    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun readFromFile() {
    try {
        val fr = FileReader("test.txt")
        var c: Int?

        do {
            c = fr.read()
            print(c.toChar())
        } while (c != -1)

        fr.close()
    } catch (ex: Exception) {
        println(ex.message)
    }
}
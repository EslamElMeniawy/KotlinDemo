import java.io.FileWriter

/**
 * Files
 *
 * Created by Eslam El-Meniawy on 13-May-2018.
 */

fun main(args: Array<String>) {
    print("Enter text to add: ")
    val str: String = readLine().toString()
    writeToFile(str)
}

fun writeToFile(str: String) {
    try {
        val fo = FileWriter("test.txt", true)
        fo.write(str + "\n")
        fo.close()
    } catch (ex: Exception) {
        println(ex.message)
    }
}
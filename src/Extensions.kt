/**
 * Extensions
 *
 * Created by Eslam El-Meniawy on 10-May-2018.
 */

fun main(args: Array<String>) {
    val arrayList = ArrayList<String>()
    arrayList.add("Eslam")
    arrayList.add("Sami")
    arrayList.add("El-Meniawy")
    println(arrayList)
    arrayList.swap(1, 2)
    println(arrayList)
}

fun ArrayList<String>.swap(index1: Int, index2: Int) {
    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp
}
/**
 * Comparable
 *
 * Created by Eslam El-Meniawy on 10-May-2018.
 */

fun main(args: Array<String>) {
    // Language type array list sorting
    val listOfNames = ArrayList<String>()
    listOfNames.add("Eslam")
    listOfNames.add("Sami")
    listOfNames.add("El-Meniawy")
    println("Names before sort")

    for (name in listOfNames) {
        println(name)
    }

    println("Names after sort")
    listOfNames.sort()

    for (name in listOfNames) {
        println(name)
    }

    // Custom type array list sorting
    val listOfPersons = ArrayList<Person>()
    listOfPersons.add(Person("Eslam", 5))
    listOfPersons.add(Person("Sami", 15))
    listOfPersons.add(Person("El-Meniawy", 10))
    println("Persons before sort")

    for (person in listOfPersons) {
        println(person.name + " " + person.age)
    }

    println("Persons after sort")
    listOfPersons.sort()

    for (person in listOfPersons) {
        println(person.name + " " + person.age)
    }
}

class Person(var name: String, var age: Int) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}
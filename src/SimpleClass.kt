/**
 * SimpleClass
 *
 * Created by Eslam El-Meniawy on 09-May-2018.
 */

fun main(args: Array<String>) {
    val car1 = Car("Mercedes", 2018, 2000000.0, 50000, "Eslam")
    val car2 = Car("BMW", 2017, 1500000.0, 30000, "Eslam")
    println("Car 1 price: " + car1.getCarPrice())
    println("Car 2 price: " + car2.getCarPrice())
    val car3 = Car("Eslam")
    println("Car 3 owner: " + car3.owner)
}

class Car() {
    var type: String? = null
    var model: Int? = null
    var price: Double? = null
    var km: Int? = null
    var owner: String? = null

    constructor(type: String, model: Int, price: Double, km: Int, owner: String) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.km = km
        this.owner = owner
    }

    constructor(owner: String) : this() {
        this.owner = owner
    }

    fun getCarPrice(): Double {
        return this.price!! - (this.km!!.toDouble() * 10)
    }
}
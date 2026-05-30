open class Vehicle {
    open fun startEngine() {
        println("Engine started")
    }
}

class Motorcycle : Vehicle() {
    override fun startEngine() {
        println("Vroom!")
    }
}

fun main() {
    val bike = Motorcycle()
    bike.startEngine()
}

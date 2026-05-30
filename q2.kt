class Thermostat {
    var temperature: Double = 20.0
        private set

    fun setTemperature(newTemperature: Double) {
        temperature = newTemperature
    }
}

fun main() {
    val thermostat = Thermostat()

    thermostat.setTemperature(25.5)
    println("Temperature: ${thermostat.temperature}")

    // thermostat.temperature = 30.0 // Error
}

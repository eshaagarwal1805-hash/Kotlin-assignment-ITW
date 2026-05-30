object Database {
    fun connect() {
        println("Connected to DB")
    }
}

fun main() {
    Database.connect()
}

//object in Kotlin creates a singleton, meaning only one instance of Database exists throughout the application.

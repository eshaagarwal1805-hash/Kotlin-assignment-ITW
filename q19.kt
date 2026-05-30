import kotlinx.coroutines.*

fun main(args: Array<String>) {
    runBlocking {
        launch {
            println("Background task finished")
        }
    }
}

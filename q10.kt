import kotlinx.coroutines.*

sealed class ScreenState

object loading: ScreenState()

data class success(val data: String): ScreenState()

data class Running(val data: String): ScreenState()

fun main() = runBlocking {
    launch{
        delay(400L)
    	val state: ScreenState = success("Data Loaded successfully")
    	println(state)
    }
    val state: ScreenState = Running("Data Loading in main function")
    println(state)
}

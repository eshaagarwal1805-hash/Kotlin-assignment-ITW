sealed class ScreenState

object Loading : ScreenState()

data class Success(val data: String) : ScreenState()

data class Error(val errorMsg: String) : ScreenState()

fun renderUI(state: ScreenState) {
    when (state) {
        is Loading -> println("Loading data...")
        is Success -> println("Success: ${state.data}")
        is Error -> println("Error: ${state.errorMsg}")
    }
}

fun main() {
    renderUI(Loading)
    renderUI(Success("Data loaded successfully"))
    renderUI(Error("Network connection failed"))
}

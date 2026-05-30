data class CartItem(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun List<CartItem>.calculateTotal(): Double {
    return sumOf { it.price * it.quantity }
}

sealed class CheckoutResult {
    object Processing : CheckoutResult()

    data class Success(val receiptId: String) : CheckoutResult()

    data class Failed(val reason: String) : CheckoutResult()
}

object PaymentProcessor {

    fun processPayment(cart: List<CartItem>): CheckoutResult {

        Thread.sleep(2000)

        val total = cart.calculateTotal()

        return if (total > 1000) {
            CheckoutResult.Failed(
                "Insufficient funds for large transaction"
            )
        } else {
            CheckoutResult.Success(
                "TXN-${(1000..9999).random()}"
            )
        }
    }
}

fun main() {

    val cheapCart = listOf(
        CartItem("Keyboard", 50.0, 2),
        CartItem("Mouse", 25.0, 1)
    )

    val expensiveCart = listOf(
        CartItem("Gaming Laptop", 1500.0, 1),
        CartItem("Monitor", 300.0, 1)
    )

    val thread1 = Thread {
        val result = PaymentProcessor.processPayment(cheapCart)

        when (result) {
            is CheckoutResult.Processing ->
                println("Cheap Cart: Processing")

            is CheckoutResult.Success ->
                println("Cheap Cart: Success - ${result.receiptId}")

            is CheckoutResult.Failed ->
                println("Cheap Cart: Failed - ${result.reason}")
        }
    }

    val thread2 = Thread {
        val result = PaymentProcessor.processPayment(expensiveCart)

        when (result) {
            is CheckoutResult.Processing ->
                println("Expensive Cart: Processing")

            is CheckoutResult.Success ->
                println("Expensive Cart: Success - ${result.receiptId}")

            is CheckoutResult.Failed ->
                println("Expensive Cart: Failed - ${result.reason}")
        }
    }

    thread1.start()
    thread2.start()

    thread1.join()
    thread2.join()
}

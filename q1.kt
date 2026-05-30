class BankAccount {
    private var balance: Double = 0.0

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited: ₹$amount")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

fun main() {
    val account = BankAccount()

    account.deposit(1000.0)
    account.deposit(500.0)
    account.deposit(-200.0)

    println("Current Balance: ₹${account.getBalance()}")
}

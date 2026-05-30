open class Employee(val baseSalary: Int)

class Manager : Employee(80000)

fun main() {
    val manager = Manager()
    println("Manager's Base Salary: ${manager.baseSalary}")
}

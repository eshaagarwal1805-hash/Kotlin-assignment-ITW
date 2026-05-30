fun main() {
    val list1 = listOf(1,2,3,4,5)
    println("the original list: " +list1)
    println("the filtered list: " +list1.filter { it % 2 == 0 })
}

class IDGenerator {
    companion object {
        private var currentID = 0
        
        fun getNextId(): Int {
            currentID++
            return currentID
        }
    }
}

fun main() {
    println(IDGenerator.getNextId())
    println(IDGenerator.getNextId())
    println(IDGenerator.getNextId())
}

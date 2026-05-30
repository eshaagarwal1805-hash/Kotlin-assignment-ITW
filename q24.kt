class File(val filename: String) {
    var permissions: String = ""
}

fun buildFile(filename: String): File {
    return File(filename)
        .apply {
            permissions = "Read/Write"
        }
        .also {
            println("File $filename created")
        }
}

fun main() {
    val file = buildFile("report.txt")
    println("Permissions: ${file.permissions}")
}

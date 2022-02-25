fun main() {
    val a = readLine()!!.toInt()
    while (true) {
        val b = readLine()!!.toInt()
        if (b == 0)
            break
        if (b % a == 0) {
            println("$b is a multiple of $a.")
        } else {
            println("$b is NOT a multiple of $a.")
        }
    }
}
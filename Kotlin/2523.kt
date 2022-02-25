fun main() {
    val num = readLine()!!.toInt()
    for (i: Int in 1..num) {
        for (j: Int in 1 .. i) {
            print("*")
        }
        println("")
    }

    for (i: Int in (1 until num).reversed()) {
        for (j: Int in 1 .. i) {
            print("*")
        }
        println("")
    }
}
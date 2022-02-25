fun main() {
    val cnt = readLine()!!.toInt()
    val input = readLine().toString()
    val list = input.split(" ")
    var min = 1000000
    var max = -1000000

    for (i: Int in 0 until cnt) {
        if (list[i].toInt() < min) {
            min = list[i].toInt()
        }

        if (list[i].toInt() > max) {
            max = list[i].toInt()
        }
    }

    print("$min $max")
}
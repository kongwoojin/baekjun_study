fun main() {
    val cnt = readLine()!!.toInt()
    val list = readLine().toString().split(" ")
    var large = 0
    var sum = 0.0

    for (i: Int in 0 until cnt) {
        if (large < Integer.parseInt(list[i])) {
            large = Integer.parseInt(list[i])
        }
    }

    for (i: Int in 0 until cnt) {
        sum += (Integer.parseInt(list[i]).toDouble() / large.toDouble()) * 100.toDouble()
    }

    println(sum/cnt)
}
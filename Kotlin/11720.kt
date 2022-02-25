fun main() {
    val cnt = readLine()!!.toInt()
    val num = readLine().toString()
    var sum = 0

    for (i in 0 until cnt) {
        sum += Integer.parseInt(num[i].toString())
    }
    println(sum)
}
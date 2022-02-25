fun main() {
    var largeNum = 0
    var numPos = 0

    for (i: Int in 1..9) {
        val new = readLine()!!.toInt()
        if (largeNum < new) {
            largeNum = new
            numPos = i
        }
    }
    println(largeNum)
    print(numPos)
}
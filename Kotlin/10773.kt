fun main() {
    var sum = 0
    val cnt = readLine()!!.toInt()
    val arrayList = ArrayList<Int>()

    for (i: Int in 1..cnt) {
        val num = readLine()!!.toInt()
        if (num == 0) {
            arrayList.removeAt(arrayList.size-1)
        } else {
            arrayList.add(num)
        }
    }

    for (i: Int in 0 until arrayList.size) {
        sum += arrayList[i]
    }

    print(sum)
}
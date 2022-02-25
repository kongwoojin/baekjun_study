fun main() {
    val arrayList = ArrayList<Int>()

    for (i: Int in 1..10) {
        val input = readLine()!!.toInt()
        val remain = input % 42
        if (!arrayList.contains(remain)) {
            arrayList.add(remain)
        }
    }
    print(arrayList.size)
}
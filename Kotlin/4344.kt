fun main() {
    val cnt = readLine()!!.toInt()

    for (i: Int in 0 until cnt) {
        val list = readLine().toString().split(" ")

        var sum = 0
        val students = Integer.parseInt(list[0])
        for (j: Int in 1 .. students) {
            sum += Integer.parseInt(list[j])
        }

        val average: Double = sum.toDouble() / students.toDouble()
        var up = 0

        for (k: Int in 1 .. students) {
            if (list[k].toDouble() > average) {
                up += 1
            }
        }

        val percent: Double = (up.toDouble() / students.toDouble()) * 100

        println(String.format("%.3f", percent) + "%")
    }
}
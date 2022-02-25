var cnt = 0
var max = 0

fun main() {
    max = readLine()!!.toInt()
    loop(0, 0)
}

fun loop(a: Int, b: Int) {
    if (cnt < max) {
        val c = if (a == 0)
            1
        else
            b + a

        cnt += 1
        loop(b, c)
    } else {
        print(b)
    }
}

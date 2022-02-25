fun main() {
    val input = readLine()

    val arr = input!!.split(" ")

    val a = arr[0]
    val b = arr[1]
    val c = arr[2]
    var value = ""
    var count = 1

    if (a == b) {
        value = a
        count += 1
        if (b == c) {
            count += 1
        }
    } else if (a == c) {
        value = a
        count += 1
    } else if (b == c) {
        value = b
        count += 1
    } else if (a != b && b != c && a != c) {
        if (a > b) {
            if (a > c) {
                value = a
            } else if (a < c) {
                value = c
            }
        } else if (a < b) {
            if (b > c) {
                value = b
            } else if (b < c) {
                value = c
            }
        }
    }
    val num = value.toInt().times(count)

    print(10000+num)
}
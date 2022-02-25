import java.math.BigDecimal
import kotlin.math.pow

fun main() {
    val num = readLine()!!.toInt()
    val answer = String.format("%.300f", BigDecimal(1 / 2.0.pow(num)))

    var cut = 302

    for (i in answer.indices.reversed()) {
        if (answer[i].toString() == "0") {
            cut -=1
        } else {
            break
        }
    }

    println(answer.substring(0, cut))
}
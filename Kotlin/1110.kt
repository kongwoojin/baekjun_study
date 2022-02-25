fun main() {
    var cnt = 0
    var initNum = readLine().toString()
    var currNum: String

    if (initNum.length == 1) {
        initNum = "0$initNum"
    }

    currNum = initNum


    while (true) {
        val newNum = Integer.parseInt(currNum[0].toString()) + Integer.parseInt(currNum[1].toString())
        currNum = currNum[1] + (newNum % 10).toString()

        cnt += 1
        if (currNum == initNum) {
            break
        }
    }
    print(cnt)
}
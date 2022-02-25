fun main() {
    var wordCnt = 0
    val cnt = readLine()!!.toInt()
    for (i: Int in 0 until cnt) {
        val text = readLine().toString().toList()
        val split = ArrayList(text)

        val denyList = ArrayList<String>()
        var isGroupWord = true
        for (j: Int in 0 until split.size) {
            if (isGroupWord) {
                if (j < split.size - 1) {
                    if (split[j] != split[j + 1]) {
                        if (denyList.contains(split[j].toString())) {
                            isGroupWord = false
                        } else {
                            denyList.add(split[j].toString())
                        }
                    }
                } else if (j == split.size - 1){
                    if (denyList.contains(split[j].toString())) {
                        isGroupWord = false
                    }
                }
            }
        }
        if (isGroupWord) {
            wordCnt += 1
        }

    }
    print(wordCnt)
}
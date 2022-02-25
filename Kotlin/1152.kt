fun main() {
    val input = readLine().toString()
    val list = input.split(" ")
    val arrayList = ArrayList<String>()
    for (s in list) {
        if (s != "") {
            arrayList.add(s)
        }
    }

    print(arrayList.size)
}
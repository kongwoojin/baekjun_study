fun main() {
    val input = readLine().toString()
    val list = input.split(" ")
    var mixed = false

    if (list[0] != "1" && list[0] != "8") {
        mixed = true
        print("mixed")
    } else {
        var ascending = true
        for (i: Int in list.indices) {
            if (i != 0) {
                if (Integer.parseInt(list[i-1]) + 1 == Integer.parseInt(list[i])) {
                    ascending = true
                } else if (Integer.parseInt(list[i-1]) - 1 == Integer.parseInt(list[i])) {
                    ascending = false
                } else {
                    print("mixed")
                    mixed = true
                    break
                }
            }
        }
        if (!mixed) {
            if (ascending) {
                print("ascending")
            } else if (!ascending) {
                print("descending")
            }
        }
    }
}
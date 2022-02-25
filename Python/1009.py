cycle = int(input())

zero = [10]
one = [1]
two = [2,4,8,6]
three = [3,9,7,1]
four = [4,6]
five = [5]
six = [6]
seven = [7,9,3,1]
eight = [8,4,2,6]
nine = [9,1]

i = 0
nowNum = []
while i < cycle:
    a, b = map(str, input().split())
    if a[-1] == "0":
        nowNum = zero
    elif a[-1] == "1":
        nowNum = one
    elif a[-1] == "2":
        nowNum = two
    elif a[-1] == "3":
        nowNum = three
    elif a[-1] == "4":
        nowNum = four
    elif a[-1] == "5":
        nowNum = five
    elif a[-1] == "6":
        nowNum = six
    elif a[-1] == "7":
        nowNum = seven
    elif a[-1] == "8":
        nowNum = eight
    elif a[-1] == "9":
        nowNum = nine

    j = int(b) % len(nowNum)
    
    print(nowNum[j-1])

    i += 1
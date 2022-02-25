cycle = int(input())

array = []

i = 0
while i < cycle:
    file = input()
    splitValue = list(file)
    if i == 0:
        array = splitValue
    
    j = 0
    while j < len(array):
    
        if array[j] == splitValue[j]:
            array[j] = splitValue[j]
        else:
            array[j] = "?"
        j += 1
    
    i += 1
print("".join(array))
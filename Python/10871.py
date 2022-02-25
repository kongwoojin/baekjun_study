n, x = map(int, input().split())
list = list(map(int, input().split()))

final = ''
for i in list:
    if i < x:
        final += '{} '.format(str(i))
print(final)
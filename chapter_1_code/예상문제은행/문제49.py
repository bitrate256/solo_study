a, b = 1, 1
y = a + b
n = int(input())
for k in range(3, n + 1):
    c = a + b
    y = y + c
    a = b
    b = c
print(y)
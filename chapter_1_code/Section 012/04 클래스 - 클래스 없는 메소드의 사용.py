def calc(x, y):
    x *= 3
    y /= 3
    print(x, y)
    return x
a, b = 3, 12
a = calc(a, b)
print(a, b)
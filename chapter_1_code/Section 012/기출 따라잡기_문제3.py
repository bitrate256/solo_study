def prnt():
    global a, b, c
    while a < b:
        a += 1
        c += a
        prnt()
a, b, c = 0, 5, 0
prnt()
print('a =', a, end = ', ')
print('b =', b, end = ', ')
print('c =', c)
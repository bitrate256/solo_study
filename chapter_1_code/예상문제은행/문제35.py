def change():
    global i, j
    temp = i
    i = j
    j = temp
i, j = 10, 20
change()
print(f"i={i}, j={j}")
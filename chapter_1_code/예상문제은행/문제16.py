a = sum = 0
while a < 10:
    a += 1
    if a%2 == 1:
        continue
    sum += a
print(sum)
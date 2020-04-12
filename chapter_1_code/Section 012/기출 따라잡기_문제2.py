a = [50,30,70,10,90]
max = a[0]
min = a[0]
for i in range(1,5):
    if a[i] > max:
        max = a[i]
    if a[i] < min:
        min = a[i]
print(max, min, sep = '\n')
a = [[1, 1, 0, 1, 0],
     [1, 0, 1, 0]]
tot, totsu = 0, 0
for i in a:
    for j in i:
        tot += j
    totsu = totsu + len(i)
print(totsu, tot)
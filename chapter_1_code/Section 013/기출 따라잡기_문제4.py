import random
hist = [0,0,0,0,0,0]
for i in range(100):
    n = random.randrange(1, 7)
    hist[n-1] += 1
i = 0
while i < 6:
    print("[%d] = %d" % (i + 1, hist[i]))
    i += 1
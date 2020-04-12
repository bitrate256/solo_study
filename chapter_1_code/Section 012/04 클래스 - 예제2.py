class Cls:
    def rep(self, r):
        hap = 0
        for i in range(r + 1):
            hap += i
        return hap
a = Cls()
b = a.rep(10)
print(b)
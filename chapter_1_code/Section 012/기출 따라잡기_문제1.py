class CharClass:
    a = ["Seoul","Incheon","Kyonggi","Daejun","Daegu","Pusan"]
myVar = CharClass()
str01 = ''
for i in myVar.a:
    str01 = str01 + i[0]
print(str01)
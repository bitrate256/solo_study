arr_Str = input('Input String : ').split('-')
arr_Len = int(input('Input Number : '))
arr_Val = list(range(0, arr_Len, 2))
arr_Val.remove(4)
print(arr_Str[1].find('i') + arr_Val[2])
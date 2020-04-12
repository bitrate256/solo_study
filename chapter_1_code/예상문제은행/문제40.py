str = 'Sinagong'
n = len(str)
st = list()
for k in range(n):
    st.append(str[k])
for k in range(n-1, -1, -1):
    print(st[k], end = '')
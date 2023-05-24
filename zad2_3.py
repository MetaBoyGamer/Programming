def glebokosc(s):
    tmp = 0
    res = 0
    for i in s:
        if i == '[':
            tmp += 1
            if tmp >= res: res = tmp
        else:
            tmp -= 1
    return str(res)

f = open('dane2_3.txt', 'r')
x = f.readlines()
x_new = [i.rstrip('\n') for i in x]
f.close()

f = open('zadanie2_3.txt', 'w')
for i in x_new:
    f.write(glebokosc(i))
    f.write('\n')






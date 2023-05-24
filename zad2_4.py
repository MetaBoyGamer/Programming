def function(s):
    bilans = 0
    for i in s:
        if i == '[':
            bilans += 1
        else:
            bilans -= 1

        if bilans < 0:
            return 'nie\n'
    return 'tak\n'


f = open('dane2_4.txt', 'r')
x = f.readlines()
x_new = [i.rstrip('\n') for i in x]
f.close()

f = open('zadanie2_4.txt', 'w')
for i in x_new:
    f.write(function(i))
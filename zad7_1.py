with open('szyfrogram.txt', 'r') as plik:
    plik_new = [str(i.rstrip('\n')) for i in plik]
    print(plik_new)
n = 26;
t = [n]
for i in range(n):
    t[i] = 0
c = ''
while (plik_new >> c):
    t[c-'A']+= 1
i = 'A'
z = 'Z'
for i in z:
    i << " " << t[i-'A']
with open('zadanie7_1.txt', 'w') as plik:
    plik.write(plik_new)
    plik.close()

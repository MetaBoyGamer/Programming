from linecache import getline

with open('szyfrogram.txt', 'r') as plik:
    plik_new = [str(i.rstrip('\n')) for i in plik]
    print(plik_new)
with open('czestosc.txt', 'r') as plik1:
    plik_new1 = [str(i.rstrip('\n')) for i in plik1]
    print(plik_new1)
n = 26
t = []
for i in range(n):
    t[i] = 0
c = ''
while plik_new >> c:
    t[c-'A'] += 1
litera = ''
klucz = []
klucz[n] = 0
ile = 0
while plik_new1 >> litera >> ile:
    c = 'A'
    while t[c-'A']!= ile:
        c += 1
        klucz[c-'A'] = litera

with open('zadanie7_3.txt', 'w') as plik:
    plik.write(plik_new)
    plik.close()

s = ""
while getline(plik_new1, s):
    for i in s.length():
        print(klucz[s[i]-'A'])
        print()
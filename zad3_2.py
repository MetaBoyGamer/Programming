with open('dane3.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
    print(plik_new)
n = 4048
dlugosc[4048]
for i in n:
    dlugosc[i] = 0
while plik_new >> pocz >> kon:
    dlugosc[kon - pocz + 1]++
dl = -1
ile = -1
for i in n:
    if dlugosc[i]>=ile:
        ile = dlugosc[i]
        dl = i
wynik << dl 
with open('zadanie3_2.txt', 'w') as plik:
    plik.write(zapis)
    plik.close()

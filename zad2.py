with open('dane1_4.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
suma = 0
wynik = 0
for i, j in enumerate(plik_new):
    if suma <= 0:
        fakestart = i
        suma = j
    else:
        suma += j
    if suma > wynik:
        wynik = suma
        koniec = i + 1
        start = fakestart + 1
zapis = str(start) + ' ' + str(koniec)

with open('zadanie1_4.txt', 'w') as plik:
    plik.write(zapis)
    plik.close()


with open('dane1_3.txt') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
    print(plik_new)

wynik = 0
suma_chwilowa = 0

for i in plik_new:
    suma_chwilowa = max(0, suma_chwilowa + i)
    wynik = max(suma_chwilowa, wynik)

print(wynik)

with open('zadanie1_3.txt', 'w') as plik:
    plik.write(str(wynik))
    plik.close()

    

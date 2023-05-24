with open('dane6.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
    print(plik_new)
n = 2023
dl = 100
maxs[10]= {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
liczby[10]
for i in n:
    plik >> s
    maxi = 0
    suma = 0
    for j in dl:
        t = s[j]-'0'
        suma += t
        if t>msx:
            maxi = t
        if suma > maxs[maxi]:
            maxs[maxi] = suma
            liczby[maxi] = s
for i in 10:
    if maxi[i]>0:
        print(i+1+" "+liczby[i])   
with open('zadanie6_2.txt', 'w') as plik:
    plik.write(zapis)
    plik.close()

with open('dane4.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
    print(plik_new)
n = 2023
x = [n]
for i in range(n):
    int(plik_new) >> x[i]
liczba = 0
maxi = 0
for i in n:
    par = 0
    for j in n:
        if x[i] > x[j]:
            par += 1
    if par >= liczba:
        liczba = par
        maxi = i
print(maxi+1)
with open('zadanie4_3.txt', 'w') as plik:
    plik.write(plik)
    plik.close()

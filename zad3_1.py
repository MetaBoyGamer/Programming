with open('dane3.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
n = 2023
minn = 4047
minn2 = minn
for i in n:
    dane >> pocz >> kon
    dlug = kon - pocz +1
    if dlug<minn:
        minn2 = minn
        minn = dlug
    if dlug < minn2:
        minn2 = dlug
wynik << minn << " " << minn2
with open('zadanie3_1.txt', 'w') as plik:
    plik.write(zapis)
    plik.close()

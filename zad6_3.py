with open('dane6.txt', 'r') as plik:
    plik_new = [int(i.rstrip('\n')) for i in plik]
    print(plik_new)
def anty(s):
    for i in s.length()/2:
        if s[i] == s[s.length()-1-i]:
            return False
        return True
n = 2023
ile = 0
s = ""
for i in range(n):
    plik >> s
    if anty(s):
        ile += 1
        print(s)
    print(ile)
with open('zadanie6_3.txt', 'w') as plik:
    plik.write(plik_new)
    plik.close()

class Przedzial:
    def __init__(self, pocz, kon, dlugosc):
        self.pocz = pocz
        self.kon = kon
        self.dlugosc = dlugosc

# Define the zawierasie function
def zawierasie(e1, e2):
    return e2.pocz <= e1.pocz and e1.kon <= e2.kon

# Define the krotszy function
def krotszy(e1, e2):
    return (e1.kon - e1.pocz) < (e2.kon - e2.pocz)

# Read the input data and create the list of Przedzial objects
przedzialy = []

with open("dane3.txt") as dane:
    for line in dane:
        pocz, kon = map(int, line.strip().split())
        przedzialy.append(Przedzial(pocz, kon, 1))

# Sort the list of Przedzial objects by length
przedzialy.sort(key=lambda x: (x.kon - x.pocz))

# Calculate the maximum length of the chain
for i in range(1, len(przedzialy)):
    for j in range(i):
        if zawierasie(przedzialy[j], przedzialy[i]):
            if przedzialy[i].dlugosc < przedzialy[j].dlugosc + 1:
                przedzialy[i].dlugosc = przedzialy[j].dlugosc + 1


maks = 1
for elt in przedzialy:
    if elt.dlugosc > maks:
        maks = elt.dlugosc

with open("zadanie3_3.txt", "w") as wynik:
    wynik.write(str(maks) + "\n")
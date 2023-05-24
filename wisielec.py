import random;
def Again():
    file = open("words.txt", "r")
    words = file.readlines()
    rand = random.randrange(1,len(words))
    haslo = words[rand].strip("\n")
    tries = 10
    odgadywane = "*"*len(haslo)
    haslo2 = list()
    already_guessed = list()
    for i in range(len(haslo)):
        haslo2.append(" _")
    while odgadywane != haslo and tries > 0:
        if tries == 9:
            print("\n\n=========")
        elif tries == 8:
            print("\n|\n|\n|\n|\n|\n|\n|\n|\n=========")
        elif tries == 7:
            print("\n+------+\n|\n|\n|\n|\n|\n|\n|\n|")
        elif tries == 6:
            print("\n+------+\n|      |\n|      |\n|\n|\n|\n|\n|\n|\n=========")
        elif tries == 5:
            print("\n+------+\n|      |\n|      |\n|      O\n|\n|\n|\n|\n|\n=========")
        elif tries == 4:
            print("\n+------+\n|      |\n|      |\n|      O\n|      |\n|\n|\n|\n|\n=========")
        elif tries == 3:
            print("\n+------+\n|      |\n|      |\n|      O\n|      |\n|      |\n|\n|\n|\n=========")
        elif tries == 2:
            print("\n+------+\n|      |\n|      |\n|      O\n|      |\n|      |\n|     / \ \n|\n|\n=========")
        elif tries == 1:
            print("\n+------+\n|      |\n|      |\n|      O\n|     /|\ \n|      |\n|       \ \n|\n|\n=========")
        print("\n")
        for i in haslo2:
            print(i, end=" ")
        print("\n")
        print("Pozostałe próby : "+str(tries)+"\n")
        odp = str(input("Podaj litere : ")).lower()
        if odp in already_guessed:
            print("Zgadłeś!")
            continue
        else:
            already_guessed.append(odp)
        if odp == haslo:
            odgadywane = odp
            break
        if odp in haslo:
            for i in range(len(haslo)):
                if odp == haslo[i]:
                    odgadywane = odgadywane[:i]+odp+odgadywane[i+1:]
                    haslo2[i] = odp
        else:
            tries -= 1;
        if odgadywane == haslo:
            break
    if haslo == odgadywane:
        print('Hasło to: '+haslo)
        grac()
    else:
        print("\n+------+\n|      |\n|      |\n|      O\n|     /|\ \n|      |\n|     / \ \n|\n|\n=========")
        print("Hasło to: "+haslo)
        grac()
        
def grac():
    again = input(" ** Chcesz zagrać jeszcze raz? **\n ** Wpisz Y jeśli tak lub N jeśli chcesz zakończyć działanie programu: **")
    if again == 'y':
        Again()
    elif again == 'n':
        quit()
        
Again()

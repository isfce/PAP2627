def compareDate(j1, m1, a1, j2, m2, a2):
    result = 0
    # #TODO
    return result


if __name__ == "__main__":
    
    # Ajoutez une boucle pour pouvoir recommencer le programme 
    
    j1 = int(input("Entrée un jour"))
    m1 = int(input("Entrée un mois"))
    a1 = int(input("Entrée une année"))
    # Après chaque entrée d'une date, vérifiez sa validitée 1..31 jour, 1..12 mois
    j2 = int(input("Entrée un jour"))
    m2 = int(input("Entrée un mois"))
    a2 = int(input("Entrée une année"))

    res = compareDate(j1, m1, a1, j2, m2, a2)
    #Ajustez l'affichage pour j1 antérieure à j2 ou j1 egale à j2 ou j1 postérieure à j2
    print(res)
    #Demandez à l'utilisateur s'il désire continuer
    

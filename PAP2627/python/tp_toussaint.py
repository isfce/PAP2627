def compareDate(j1, m1, a1, j2, m2, a2):
    assert 0 < j1 <= 31 and 0 < m1 <= 12, 'Date 1 non valide'
    assert 0 < j2 <= 31 and 0 < m2 <= 12, 'Date 2 non valide'
    result = 0
    if a1 < a2:
        result = -1
    elif a1 > a2:
        result = 1
    elif m1 < m2:
        result = -1
    elif m1 > m2:
        result = 1
    elif j1 < j2:
        result = -1
    elif j1 > j2:
        result = 1
    return result


def compareDate2(j1, m1, a1, j2, m2, a2):
    assert 0 < j1 <= 31 and 0 < m1 <= 12, 'Date 1 non valide'
    assert 0 < j2 <= 31 and 0 < m2 <= 12, 'Date 2 non valide'
    result = a1 - a2
    if result == 0:
        result = m1 - m2
        if result == 0:
            result = j1 - j2
    if result < 0:
        result = -1
    elif result > 0:
        result = 1
    return result


def compareDate3(j1, m1, a1, j2, m2, a2):
    assert 0 < j1 <= 31 and 0 < m1 <= 12, 'Date 1 non valide'
    assert 0 < j2 <= 31 and 0 < m2 <= 12, 'Date 2 non valide'
    d1 = a1 * 10000 + m1 * 100 + j1
    d2 = a2 * 10000 + m2 * 100 + j2
    result = d1 - d2
    if result < 0:
        result = -1
    elif result > 0:
        result = 1
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
    # Ajustez l'affichage pour j1 antérieure à j2 ou j1 egale à j2 ou j1 postérieure à j2
    print(res)
    # Demandez à l'utilisateur s'il désire continuer
    

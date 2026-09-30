
def estMajuscule(lettre):
    '''vérifie si une lettre est une majuscule ou une minuscule'''
    assert isinstance(lettre,str) and len(lettre)==1 and lettre.isalpha ;'Le type doit être de type caractère'
    return True

print(estMajuscule('L'))
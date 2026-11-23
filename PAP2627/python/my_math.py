import math


def estPair(nbr):
    return True


def fact(n):
    ''' calcule la factorielle de n'''
    assert n >= 0 , 'n doit être positif'
    res = 1
    for i in range(2, n + 1):
        res = res * i
    return res


def calculSomme(n:int, m:int) -> int:
    '''Calcule la somme de n à m'''
    assert n <= m , 'n doit être <= m'
    if n < 0 and m > 0:
        if -n == m:
            return 0
        if -n > m: 
            m = -m - 1
        else:
            n = -n + 1
    s = n
    for i in range(n + 1, m + 1):
        s = s + i
    return s


def fibo(n):
    ''' suite de fibonacci FN'''
    assert n >= 0 , "n doit être >=0"
    if n < 2:
        return n
    f0, f1 = 0, 1
    for i in range(2, n + 1):
        f2 = f1 + f0
        f0, f1 = f1, f2
  
    return f1    


def nombreOr(eps:float) -> int:
    ''' nombre d'itérations pour obtenir la précision epsilon du nombre d'or
        à partir de Fibonacci'''
    assert eps > 0 , " eps doit être >0 "
    
    eps = abs(eps)  # sécurité au cas où assert par activé
    phi = (1.0 + math.sqrt(5)) / 2.0
    f0, f1 = 1, 1
    n = 1
    while abs(phi - f1 / f0) > eps:
        f0, f1 = f1, f0 + f1
        n = n + 1
    return n


def estPremier(n:int) -> bool:
    assert n >= 2, ' n doit être >=2'
    premier = n == 2 or n % 2 != 0
    d = 3
    while premier and d * d <= n:
        premier = n % d != 0
        d = d + 2
    return premier


if __name__ == "__main__":
    print(nombreOr(0.001))
    

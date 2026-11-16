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


if __name__ == "__main__":
    print(fact(100))

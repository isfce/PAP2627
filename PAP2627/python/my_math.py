def estPair(nbr):
    return True


def fact(n):
    ''' calcule la factorielle de n'''
    assert n >= 0 , 'n doit être positif'
    res = 1
    for i in range(2,n+1):
        res = res * i
    return res


if __name__ == "__main__":
    print(fact(100))

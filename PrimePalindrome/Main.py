
counter = 999
resultFound = False


def isPrime(a):
    for x in range (2, a):
        if a % x == 0:
            return False
    return True

while resultFound != True:
    if isPrime(counter) == True:
        word = str(counter)
        if word[0] == word[2]:
            resultFound = True
    counter-=1

print(word)

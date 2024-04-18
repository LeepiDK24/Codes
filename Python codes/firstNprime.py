def isPrime(num):
    for i in range(2,int(num**0.5)+1):
        if(num%i==0):
            return False
    return True

def primeN(N):
    primes = []
    num = 2
    while len(primes) < N:
        if isPrime(num):
            primes.append(num)
        num += 1
    return primes
N=int(input("Enter N : "))
res=primeN(N)
print(res)
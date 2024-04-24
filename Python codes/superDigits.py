def sumDigits(sum):
    if(sum<=ord('10')):
        return sum
    return n%10 + sumDigits(sum//10)

def superDig(sum):
     if(sum<=ord('10')):
         return sum
     return superDig(sumDigits(sum))


n = input("Enter a number: ")
k = input("Enter k : ")
sum=0
for d in n:
    sum += ord(d) + ord('0')
sum *= k;
print(superDig(sum))
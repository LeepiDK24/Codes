# def fibonacci(F):
#     for i in F:
#         if(F[i]==F[i-1]+F[i-2]):
#             return True

# F=list(map(int,input("Enter a list : ").split()))
# if(F[0] !=0 ):
#    print("False")
# elif(F[1] != 1):
#     print("False")
# else:
#     res=fibonacci(F)
# print(res)

n=int(input())
def isPowerOfFour(n: int) -> bool:
    if n==1:
        return True
    if n==0:
        return False
    return (n%4==0) and isPowerOfFour(n//4)
print(isPowerOfFour(n))

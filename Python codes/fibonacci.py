def fibonacci(F):
    for i in F:
        if(F[i]==F[i-1]+F[i-2]):
            return True

F=list(map(int,input("Enter a list : ").split()))
if(F[0] !=0 ):
   print("False")
elif(F[1] != 1):
    print("False")
else:
    res=fibonacci(F)
print(res)


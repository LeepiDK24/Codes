def printnat(l,r):
    if(l>r):
        return
    print(l)
    printnat(l+1,r)
    return
l=int(input("Enter l "))
r=int(input("Enter r "))

res=printnat(l,r)
print(res)
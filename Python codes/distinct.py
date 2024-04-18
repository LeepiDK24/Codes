def distinct_elements(li):
    for i in li:
        if i not in dist:
            dist.append(i)
    return dist

li=list(map(int,input("Enter the list : ").split()))
dist=[]
res=distinct_elements(li)
print(res)

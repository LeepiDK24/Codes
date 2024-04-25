mem=0
t=int(input())
for i in range(0,t):
    n=int(input())
ap=[0]*100
for i in range(4,3*n+1,3):
    ap[i]=i
for i in range(0,t+1):
    for j in range(0,n):
        if ap[i] != j:
            mem += 1
        else:
            mem += (2 ** j )
        
    print(mem)
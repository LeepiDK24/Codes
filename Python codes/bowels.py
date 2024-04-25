cal = 0
pos = -1
t=int(input())
for i in range(0,t):
    s=input()
    for j in range(0,len(s)):
        cal=cal+ord(s[j])
        if(cal >= 270):
            pos = j
            print(pos)
            break
        else:
            print(-1)

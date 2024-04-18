a=[1,2,3]
b=[3,4,5]
c=[x for x in a]
print(c)
for i in b:
    if i not in c:
        c.append(i)

print(c)
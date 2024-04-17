# import math
a=int(input("Enter a"))
flag=0
for i in range(1,a):
    if(a%i==0):
        flag=0
    else:
        flag=1

if(flag==1):
    print("Prime")
else:
    print("Non-Prime")
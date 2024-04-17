a=float(input("Enter a"))
b=float(input("Enter b"))
# vd variables
temp=a
a=b
b=temp
print("Numbers after swapping",a,b)
# vdout variables
a=a+b
b=a-b
a=a-b
print("Numbers after swapping",a,b)

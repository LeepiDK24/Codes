a=int(input("Enter a"))
# Method 1
if(a%2==0):
    print("Even")
else:
    print("Odd")

# Method 2
if((a&1)==1):
    print("Odd")
else:
    print("Even")

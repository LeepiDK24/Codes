string=input("Enter a string : ")
shift=int(input("Enter shift : "))
left=string[shift:] + string[:shift]
print(left)
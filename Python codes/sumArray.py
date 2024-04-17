arr=input("Enter the array")
arr_new=list(map(int,arr.split()))
print(arr_new)

for i in range(arr_new):
    sum+=i
print(sum)
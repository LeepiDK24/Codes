def ZeroMatrix(matrix):
    pass



m=int(input("Enter rows"))
n=int(input("Enter cols"))
matrix=[]
print("Enter array elements row wise")
for i in range(m):
    row = []
    for j in range(n):
        element = int(input())
        row.append(element)
    matrix.append(row)
print(ZeroMatrix(matrix))


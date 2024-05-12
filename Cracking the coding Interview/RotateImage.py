def RotateImage(matrix):
    l=len(matrix)
    for i in range(l):
        for j in range(i+1,l):
            matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
    
    for i in range(l):
        matrix[i]=matrix[i][::-1]
    return matrix
    

n=int(input("Enter the dimension"))
matrix=[]
print("Enter array elements row wise")
for i in range(n):
    row = []
    for j in range(n):
        element = int(input())
        row.append(element)
    matrix.append(row)
print(RotateImage(matrix))
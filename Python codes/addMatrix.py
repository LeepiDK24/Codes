A=[[1,2,3],[4,5,6]]
B=[[5,6,1],[7,8,0]]
# sum=[[0,0],[0,0]]
sum=[ [0 for j in range(len(A[0]))]for i in range(len(A)) ]
# for i in range(len(A)):
#     for j in range(len(A[0])):
#         sum[i][j]=A[i][j]+B[i][j]
sum=[[A[i][j]+B[i][j] for j in range(len(A[0]))] for i in range(len(A)) ]
print(sum)
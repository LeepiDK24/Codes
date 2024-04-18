A=[[1,2,3],[4,5,6]]
B=[[5,6,1],[7,8,0]]
dif=[ [0 for j in range(len(A[0]))]for i in range(len(A)) ]
dif=[[A[i][j]-B[i][j] for j in range(len(A[0]))] for i in range(len(A)) ]
print(dif)
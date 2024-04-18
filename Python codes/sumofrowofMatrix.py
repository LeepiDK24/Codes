A=[[1,2,3],[4,5,6]]
rows=2
cols=3
res=[[j[i]+=A[j][i] for i in cols] for j in range(rows)]
# for j in A:
#   for 
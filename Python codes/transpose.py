A=[[1,2,3],[4,5,6]]
row=2
col=3
trans=[[row[j] for row in A] for j in range(col)]
print(trans)
A=[[1,2,5],[8,0,9],[7,5,2],[99,77,4]]
row=4
col=3
trans=[[row[j] for row in A] for j in range(col)]
print(trans)
col_sum=[sum(col) for col in trans]
print(col_sum)
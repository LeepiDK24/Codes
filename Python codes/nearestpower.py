import math
number = int(input("Enter n : "))
log=math.log2(number)
nearest_pow=round(log)
ans=2**nearest_pow
print(f"The nearest power of two for {number} is:",ans)

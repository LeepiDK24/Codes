# sum of elements
# li=list(map(int,input("Enter a list").split()))
# sum=0
# for i in li:
#     sum+=i
# print(sum)

# sum of odd indices - sum of even indices
# li=list(map(int,input("Enter a list").split()))
# odd=li[1::2]
# even=li[0::2]
# sumodd=sumeven=0
# for i in odd:
#     sumodd+=i
# for j in even:
#     sumeven+=j
# res=sumodd=sumeven
# print(res)

# palindrome
# li1=list(map(int,input("Enter a list").split()))
# li1_rev=li1[::-1]
# if(li1==li1_rev):
#     print("Palindrome")
# else:
#     print("NOt")

# Adjacent Value sum
# li=list(map(int,input("Enter a list").split()))
# l=[]
# for i in range(0,len(li)-1):
#     l.append(li[i]+li[i+1])
# print(l)

# Prefix sum
# li=list(map(int,input("Enter a list : ").split()))
# pre=[]
# pre.append(li[0])
# for i in range(1,len(li)):
#     pre.append(li[i]+pre[i-1])
# print(pre)

# list comprehension
# l=[1,2,3]
# nl=[x**2 for x in l]
# print(nl)

# union of array
l1=[1,2,3,4]
l2=[1,5,3,6]
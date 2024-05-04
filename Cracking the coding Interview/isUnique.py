def isUnique(s):
    for i in range(len(s)):
        for j in range(i+1,len(s)):
            if s[i]==s[j]:
                return False
    return True

s=input("Enter string : ")
if isUnique(s):
    print("String is unique")
else:
    print("String is not unique")
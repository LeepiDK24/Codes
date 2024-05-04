def url(s):
    res = ""
    for char in s:
        if char == " ":
            res += "%20"
        else:
            res += char
    return res
s=input("Enter string : ")
trim=' '.join(s.split())
print(url(trim))




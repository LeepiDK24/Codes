string1=input("Enter 1st string : ")
string2=input("Enter 2nd string : ")
temp1=''.join(sorted(string1))
temp2=''.join(sorted(string1))

if(temp1==temp2):
    print("Anagram")
else:
    print("Not")
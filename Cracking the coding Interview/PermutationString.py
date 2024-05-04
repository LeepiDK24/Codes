def sortedstring(s):
    sorted_char=sorted(s)
    sorted_str=''.join(sorted_char)
    return sorted_str
s1=input("Enter 1st string")
s2=input("Enter 2nd string")
if sortedstring(s1)==sortedstring(s2):
    print("Permutation")
else:
    print("Not a permutation")
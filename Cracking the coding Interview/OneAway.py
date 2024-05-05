def one_away(str1, str2):
    if abs(len(str1) - len(str2)) > 1:
        return False

    edit_count = 0
    index1, index2 = 0, 0

    while index1 < len(str1) and index2 < len(str2):
        if str1[index1] != str2[index2]:
            edit_count += 1
            if len(str1) == len(str2):
                index1 += 1
                index2 += 1
            elif len(str1) > len(str2):
                index1 += 1
            else:
                index2 += 1
        else:
            index1 += 1
            index2 += 1

    return True if(edit_count<=1) else False

str1=input("Enter 1st string")
str2=input("Enter 2nd string")
print(one_away(str1,str2))
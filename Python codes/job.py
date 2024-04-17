age=int(input("Enter age"))
category=input("Enter category")
exp=int(input("Enter Experience"))
if(age<18):
    print("Not Eligible")
if(category=="Tech"):
    if(exp>=2):
        print("Eligible for tech")
    else:
        print("Not eligible for tech")
else:
    if(category=="Finance" and exp>=3):
        print("Eligible for finance")
    else:
        print("Not eligible for finance")
    
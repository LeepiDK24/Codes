annual_salary=int(input("Enter annual Salary"))
tax=int(input("Enter tax rate"))
temp=annual_salary*((1-tax)/100)
print("Monthly salary is", temp/12)

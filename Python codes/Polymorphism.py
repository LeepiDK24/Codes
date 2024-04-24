class Complex:
    def __init__(self, real, imag):
        self.real = real
        self.imag = imag
    # def __add__(self,b):
    #     return Complex(self.real + b.real,self.imag + b.imag)
    # def __sub__(self,b):
    #     return Complex(self.real - b.real,self.imag - b.imag)
    def __add__(self):
        return str(self.real + string1.imag)


# a=Complex(5,7)
# b=Complex(2,3)
# addition=a + b
# substraction=a-b
# print(addition.real,addition.imag)
# print(substraction.real,substraction.imag)
string1=Complex("abc","def")
print(string1)

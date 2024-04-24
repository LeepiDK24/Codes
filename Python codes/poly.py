# class MyComplex:
#     def _init_(self, real, imag):
#         self.real = real
#         self.imag = imag

#     def _add_(self, other):
#         if isinstance(other, MyComplex):
#             return MyComplex(self.real + other.real, self.imag + other.imag)
#         elif isinstance(other, str):
#             return str(self) + other
#         else:
#             raise TypeError("Unsupported operand type for +")

#     def _sub_(self, other):
#         if isinstance(other, MyComplex):
#             return MyComplex(self.real - other.real, self.imag - other.imag)
#         else:
#             raise TypeError("Unsupported operand type for -")

#     def _mul_(self, other):
#         if isinstance(other, MyComplex):
#             return MyComplex(self.real * other.real - self.imag * other.imag,
#                              self.imag * other.real + self.real * other.imag)
#         elif isinstance(other, int) or isinstance(other, float):
#             return MyComplex(self.real * other, self.imag * other)
#         else:
#             raise TypeError("Unsupported operand type for *")

#     def _truediv_(self, other):
#         if isinstance(other, MyComplex):
#             conjugate = MyComplex(other.real, -other.imag)
#             denominator = other.real*2 + other.imag*2
#             numerator = self * conjugate
#             return MyComplex(numerator.real / denominator, numerator.imag / denominator)
#         elif isinstance(other, int) or isinstance(other, float):
#             return MyComplex(self.real / other, self.imag / other)
#         else:
#             raise TypeError("Unsupported operand type for /")

#     def _str_(self):
#         return f"{self.real} + {self.imag}i"


# # Test the implementation
# c1 = MyComplex(3, 2)
# c2 = MyComplex(1, 4)
# print("Complex Numbers:")
# print("c1 =", c1)
# print("c2 =", c2)
# print("Addition:", c1 + c2)
# print("Subtraction:", c1 - c2)
# print("Multiplication:", c1 * c2)
# print("Division:", c1 / c2)
# print()

# # Test with strings
# s1 = "Hello"
# s2 = " World!"
# print("Strings:")
# print("s1 =", s1)
# print("s2 =", s2)
# print("Addition:", c1 + s1)

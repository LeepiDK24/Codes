# class vehicle:   #base class
#     def display():
#         print("I m a vehicle")
# class car(vehicle):  #derived class 
#     def m():
#         print("I m a car")
#         super().display()  #super() is used to call the base class method
# c=car()
# c.m()
# c.display()

#there is  a by default object class 
#object class is the base class of all the classes
#object class is the parent class of all the classes

# class shape:
#     def __init__(self,sides) :
#        self.sides=sides

#     def get_no_of_sides(self):
#         return self.sides

# class Square(shape):
#     def __init__(self, len):
#         self.len=len
#         super.__init__()

# sq=Square()
# sq.get_no_of_sides()


# Multiple inheritance
class Shape:
    def __init__(self,sides):
        self.sides =sides
class Quad(Shape):
    def __init(self,a1,a2,sides):
        self.a1=a1
        self.a2=a2
        super().__init__(sides)






# Accessing multiple classes by a sinle child classes



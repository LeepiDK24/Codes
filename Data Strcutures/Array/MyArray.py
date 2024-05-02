class MyArray:
    def __init__(self,cap : int ):
        self.__capacity=cap
        self.size = 0
        self.data = [None] * cap

    def __getitem__(self,index :int ):
        if 0 < index <= self.__size :
            return self.__data[index] 
        else:
            raise IndexError("Index out of bound") 
        
    def __setitem__(self,index,value):
           if 0 < index <= self.__size :
                self.__data[index]=value

    def __len__(self):
        return self.__size
    
    def __resize(self):
         new_array=[None]*self.__capacity*2
         for i in range(self.__size):
              new_array[i]=self.__data[i]
              self.__capacity=2*self.__capacity
              self.__data=new_array
              
    def append(self,value):
        if self.__size < self.__capacity:
             self.__data[self.__size] = value
             self.__size += 1
        else:
            self.__resize()
            self.__data[self.__size] = value
            self.__size += 1
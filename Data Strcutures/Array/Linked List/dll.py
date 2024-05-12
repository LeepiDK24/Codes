class Node:
    def __init__(self, data,next=None,prev=None):
        self.data = data
        self.prev=prev
        self.next = next
    def __str__(self):
        return str(self.data)


class DLL:
    def __init__(self):
        self.__head=None
        self.__tail=None
        self.__size=0

    def size(self):
        return self.__size

    def is_empty(self):
        return self.__size==0
    
    def append(self,data):
        new_node=Node(data)
        if self.is_empty():
            self.__head=new_node
            self.__tail=new_node
        else:
            self.__tail.next=new_node
            new_node.prev=self.__tail
            self.__tail=new_node
        self.__size+=1

    def __str__(self):
        l=[]
        trav=self.__head
        while trav is not None:
            l.append(trav.data)      #alternative : l.append(str(trav.data))
            trav=trav.next
        return '<--->'.join(map(str,l))    #alternative : return '<---->'.join(l)
    
    def addFirst(self,data):
        new_node=Node(data)
        if self.is_empty():
            self.__head=new_node
            self.__tail=new_node
        else:
            new_node.next=self.__head
            self.__head.prev=new_node
            self.__head=new_node
        self.__size+=1
    def addAt(self,index,data):
        if index<0 or index >self.size():
            raise IndexError("Index out of range")
        if index==0:
            self.addFirst(data)
        elif index==self.size():
            self.append(data)
        else:
            id=0
            trav=self.__head
            while id != index-1:
                trav=trav.next
        newNode=Node(self,data,trav,trav.next)
        trav.next=newNode
        newNode.next.prev=newNode
        self.__size += 1
    
    def removeFirst(self):
        if self.is_empty():
            raise Exception("List is empty")
        else:
            temp=self.__head
            self.__head=self.__head.next
            self.__head.prev=None
            del temp
            self.__size-=1
    
    def removeLast(self):
        if self.is_empty():
            raise Exception("List is empty")
        else:
            temp=self.__tail
            self.__tail=self.__tail.prev
            self.__tail.next=None
            del temp
            self.__size-=1
        
#Example usage
l=DLL()
print(l.size())
print(l.is_empty())
l.append(5)
l.append(90)
print(l.size())
print(l)
l.append(50)
print(l)
l.addFirst(100)
print(l)
print(l.size()) 
# l.addAt(2,34)
# print(l)
l.removeFirst()
print(l)
l.removeLast()
print(l)
l.addFirst(100)
print(l)

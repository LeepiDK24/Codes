class Node:
    def __init__(self, data,next=None,prev=None):
        self.data = data
        self.prev=prev
        self.next = next
    def __str__(self):
        return str(self.data)
# Eg usage
n=Node(10)
print(n)   
print(n.data)
# ye print function calls __str__ 
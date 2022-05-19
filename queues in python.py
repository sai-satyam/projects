class Queue:
    def __init__(self):
        self.items = []
 
    def is_empty(self):
        return self.items == []
 
    def enqueue(self, data):
        self.items.append(data)
 
    def dequeue(self):
        return self.items.pop(0)
        print("\n")
    def display(self):
        return self.items
 
 
q = Queue()
while True:
    print('enqueue value')
    print('dequeue')
    print("display")
    print('quit')
    do = input('What would you select to do? ').split()
 
    operation = do[0].strip().lower()
    if operation == 'enqueue':
        q.enqueue(int(do[1]))
    elif operation == 'dequeue':
        if q.is_empty():
            print('Queue is empty.\n')
        else:
            print('Dequeued value: ', q.dequeue(),'\n')
    elif operation== 'display':
        d=q.display()
        print(d)
    elif operation == 'quit':
        break

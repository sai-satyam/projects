global l
l=[]
print("enter 4 to display\nenter 1 to push\nenter 2 to pop")
a=int(input("enter your option"))
while(a<4):
    if(a==1):
        def p():
            e=int(input("enter element to push"))
            l.append(e)
        p()
    elif(a==2):
        def po():
            try:
                print("element is poped")
                l.pop()
            except:
                print("under flow")
        po()
    else:
        pass
    a=int(input("enter option"))
print("the element in a stack are:")
print(l)


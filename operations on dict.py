global k,f,p
k=[]
f=[]
print("enter 1 to insert\nenter 2 to update\nenter 3 to delete\nenter 4 to print a value\nenter 5 to print the list\nenter 6 to exit\n")
a=int(input("enter your choice "))
while(a<6):
    if(a==1):
        print("\tINSERTION")
        n=(input("enter key "))
        k.append(n)
        m=(input("enter value "))
        f.append(m)
        a=int(input("enter your choice "))
        p=dict(zip(k,f))
    if(a==2):
        print("\tUPDATING")
        n=(input("enter key "))
        k.append(n)
        m=(input("enter value "))
        f.append(m)
        p=dict(zip(k,f))
        a=int(input("enter your choice "))
    if(a==3):
        print("\tDELETING")
        print(p)
        S=input("enter a key value to delete it's value from the above list ")
        p.pop(S)
        print(p)
        a=int(input("enter your choice "))
    if(a==4):
        print("\tPRINTING VALUE")
        print(p)
        j=input("enter a key value to print it's value from the above list ")
        print(p[j])
        a=int(input("enter your choice "))
    if(a==5):
        print("\tPRINTING LIST")
        print(p)
        a=int(input("enter your choice "))
print("\tover")
        
    

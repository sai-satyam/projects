k=[]
f=[]
p={}
a=int(input("enter your choice "))
while(a<5):
    if(a==1):
        print("INSERTION")
        n=(input("enter key "))
        k.append(n)
        m=(input("enter value "))
        f.append(m)
        a=int(input("enter your choice "))
    if(a==2):
        print("UPDATING")
        n=(input("enter key "))
        k.append(n)
        m=(input("enter value "))
        f.append(m)
        a=int(input("enter your choice "))
    if(a==3):
        print("DELETING")
        p=dict(zip(k,f))
        S=input("enter a key value to delete it from the above list ")
        p.POP(S)
print(dict(zip(k,f)))

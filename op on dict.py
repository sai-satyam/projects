global s,f,e
s={}
f={}
e={}
print("enter 0 to insert\nenter 1 to update\nenter 3 to delete a key value\nenter 4 to display the value of a particular key\nenter 5 to display")
p=int(input("enter your option "))
while(p<5):
    if(p==0):
        def v(**kwargs):
            pass
        n=input("enter the key ")
        m=input("enter the value ")
        v={n:m}
        s=list(s)
        s.append(v)
        print("\tinsertion done")
    if(p==1):
        def v(**kwargs):
            pass
        n=input("enter the key ")
        m=input("enter the value ")
        v={n:m}
        f.update(v)
        print("\tdictionary updated")
    if(p==3):
        m=input("enter key value in the list to delete ")
        del e[m]
    if(p==4):
        c=input("enter key value in the list to display its value ")
        a=e[c]
        print(a)
    p=int(input("enter your option "))
print(s)
print(f)
s.update(f)
print(s)
        
        


p=int(input("enter the size of hash table "))
j=[-1]*p
for i in range(p):
    a=int(input("enter the element "))
    h=a%p
    if(j[h]==-1):
        j[h]=a
    else:
        if(j[h]!=-1):
            print("collision occurs at ",a)
            if(j[i]==-1):
                j[i]=a
            else:
                pass
        else:
            pass
print(j)


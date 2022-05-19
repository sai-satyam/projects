global a
p=int(input("enter the size of hash table "))
d=int(input("how many elements do you want to enter "))
j=[-1]*p
if(d<p):
    for i in range(d):
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
else:
    print("the no of elements that we are going to insert into the hash table should be lessthan the size of the hash table")
print(j)
print("do you want to perform any other operations like\ndeletion\nprinting values\nprintng a value at particular index\nif yes than enter\n1 to delete\n2 to printing values\n3 to printng a value at particular index\n4 to exit")
c=int(input("enter your option "))
while(c<4):
    if(c==1):
        h=int(input("enter the index to delete the value at that index "))
        j.pop(h)
        c=int(input("enter your option "))
    if(c==3):
        k=int(input("enter the index to print the value at that index "))
        print(j[k])
        c=int(input("enter your option "))
    if(c==2):
        for m in range(len(j)):
            print("\t|   ",m,"\t  |  ",j[m])
        c=int(input("enter your option "))
print("\tover")
        




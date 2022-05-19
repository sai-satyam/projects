global a,p
p=int(input("enter the size "))
d=int(input("how many elements do you want to insert "))
j=[-1]*p
for i in range(d):
    a=int(input("enter the value "))
    h=a%p
    if(j[h]==-1):
        j[h]=a
    else:
        t=1
        h1=(a+(t**2))%p
        if(j[h1]==-1):
            j[h1]=a
        else:
            t=2
            h1=(a+(t**2))%p
            if(j[h1]==-1):
                j[h1]=a
            else:
                t=3
                h1=(a+(t**2))%p
                if(j[h1]==-1):
                    j[h1]=a
                else:
                    t=4
                    h1=(a+(t**2))%p
                    if(j[h1]==-1):
                        j[h1]=a
                    else:
                        t=5
                        h1=(a+(t**2))%p
                        if(j[h1]==-1):
                            j[h1]=a
                        else:
                            pass
print(j)
                


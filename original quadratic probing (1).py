global a,p,k,q
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
        k=0
        q=1
        while(k<q):
        		if(j[h1]==-1):
        			j[h1]=a
        			k=q+1
        			break
        		else:
        			t=t+1
        			h1=(a+(t**2))%p
        			q=q+1
print(j)

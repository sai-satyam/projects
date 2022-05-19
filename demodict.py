s={'a':1,2:'b'}
d={3:'c',4:'d'}
h=s.copy()
for key ,value in d.items():
    h[key]=value
print(h)
print(h['a'])

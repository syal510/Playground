a=int(input())
b=int(input())
c=int(input())
s=int(input())
aa=(a+c)/2
bb=(b+s)/2
if aa-round(aa)!=0:
    aa=str(aa)
else:
    aa=str(int(aa))
if bb-round(bb)!=0:
    bb=str(bb)
else:
    bb=str(int(bb))
v="Rachel's house is located at"  
vv='('+aa+','+bb+')'
print(v+vv)
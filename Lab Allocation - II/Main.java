a=int(input())
b=int(input())
c=int(input())
d=input()

if d=='L1':
  if b<c:
    print('L2')
  else: print('L3')
if d=='L2':
  if a<c:
    print('L1')
  else: print('L3') 
if d=='L3':
  if a<b:
    print('L1')
  else: print('L2')    